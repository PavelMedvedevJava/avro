package com.example.avro.comsumer;

import com.example.event.schema.Event;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface EventMessagingConsumerService {
	void obtainEvent(ConsumerRecord<String, Event> record);
}
