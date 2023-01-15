package com.berkay.order.controller;

import com.berkay.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    KafkaTemplate<String, Order> kafkaTemplate;
    private static final String TOPIC = "orders";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Order order) {
        // Sending the message
        kafkaTemplate.send(TOPIC, order);
        return "Order Published Successfully";
    }
}
