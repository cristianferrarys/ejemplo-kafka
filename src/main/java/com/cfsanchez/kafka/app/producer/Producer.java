package com.cfsanchez.kafka.app.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableBinding(Source.class)
@RestController
@RequestMapping("/api")
public class Producer {

	@Autowired
	private Source source;

	@GetMapping("/{mensaje}")
	public String publish(@PathVariable(name = "mensaje") final String mensaje) {
		source.output().send(MessageBuilder.withPayload(mensaje).build());
		return "Mensaje enviado ";
	}
}
