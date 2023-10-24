package com.example.avro.controller;


import com.example.avro.producer.EventMessagingProducerService;
import com.example.event.schema.Event;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Data
public class EventController {
	private EventMessagingProducerService messagingService;

	@PostMapping("sendEvent")
	public Event asyncCreateEvent(@RequestBody Event event) {
		return messagingService.sendEvent(event);
	}
}
