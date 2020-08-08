package com.cfsanchez.kafka.app.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class Consumer {

	@StreamListener(Sink.INPUT)
	public void consumer(String msj) {
		System.out.println(msj);
	}

}
