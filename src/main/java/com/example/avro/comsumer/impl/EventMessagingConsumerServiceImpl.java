package com.example.avro.comsumer.impl;

import com.example.avro.comsumer.EventMessagingConsumerService;
import com.example.event.schema.Event;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EventMessagingConsumerServiceImpl implements EventMessagingConsumerService {

	@Override
	@KafkaListener(topics = "${avro.topic.name}",containerFactory = "kafkaListenerContainerFactory")
	public void obtainEvent(ConsumerRecord<String, Event> record) {
		log.info("payload {} was received in the Consumer", record.key() + "," +record.value());
	}
}
