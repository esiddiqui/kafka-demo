package com.es.kafka.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Subscriber {

    private static Logger logger = LoggerFactory.getLogger(Subscriber.class);

    @KafkaListener(topics="${topic.topic.test}")
    public void receive(String payload) {
        logger.info("Message received: {}", payload);
    }

}
