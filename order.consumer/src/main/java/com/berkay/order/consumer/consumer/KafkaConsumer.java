package com.berkay.order.consumer.consumer;// Java Program to Illustrate Kafka Consumer
// Importing required classes

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

// Class
public class KafkaConsumer {
    @KafkaListener(topics = "orders", groupId = "order")

    // Method
    public void consume(String message) {
        // Print statement
        System.out.println("message = " + message);
    }
}
