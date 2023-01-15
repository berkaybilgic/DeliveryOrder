package com.berkay.order.consumer.consumer;
import com.berkay.order.consumer.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "orders", groupId = "order", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(Order order) {
        // Print statement
        System.out.println("message = " + order);
    }
}
