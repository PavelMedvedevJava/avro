package com.example.avro.producer.impl;


import com.example.avro.producer.EventMessagingProducerService;
import com.example.event.schema.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Data
@RequiredArgsConstructor
@Slf4j
@Service
public class EventMessagingProducerServiceImpl implements EventMessagingProducerService {
	private KafkaTemplate<String, Event> kafkaTemplate;
	private ObjectMapper mapper;

	@Value("${avro.topic.name}")
	private String topicName;

	@Override
	public Event sendEvent(Event event) {

		final ListenableFuture<SendResult<String, Event>> send =
			(ListenableFuture<SendResult<String, Event>>) kafkaTemplate.send(topicName, String.valueOf(event.getEventId()), event);

		send.addCallback(new ListenableFutureCallback<SendResult<String, Event>>() {
			@Override
			public void onFailure(Throwable ex) {
				log.info("{} didn't sent in the {} topic, there some error {} ",
					event,
					topicName,
					ex.getMessage());
			}

			@Override
			public void onSuccess(SendResult<String, Event> result) {
				log.info("Event : {} was sent in the {} topic ", event, topicName);
			}
		});

		return event;
	}
}
