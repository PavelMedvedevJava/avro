package com.example.avro.producer;

import com.example.event.schema.Event;

public interface EventMessagingProducerService {
	Event sendEvent(Event event);
}
