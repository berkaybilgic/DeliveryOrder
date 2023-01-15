package com.berkay.order.consumer.deserializer;

import com.berkay.order.consumer.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

@Slf4j
public class CustomDeserializer implements Deserializer<Order> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public Order deserialize(String topic, byte[] data) {
        try {
            if (data == null){
                System.out.println("Null received at deserializing");
                return null;
            }
            System.out.println("Deserializing...");
            return objectMapper.readValue(new String(data, "UTF-8"), Order.class);
        } catch (Exception e) {
            throw new SerializationException("Error when deserializing byte[] to Order");
        }
    }
}
