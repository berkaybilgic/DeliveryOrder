package com.berkay.order.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Order implements Serializable {

    @JsonProperty("orderId")
    private String orderId;
    @JsonProperty("orderName")
    private String orderName;
    @JsonProperty("location")
    private String location;
    @JsonProperty("user")
    private  User user;

    public Order() {
    }

    public Order(String orderId, String orderName, String location, User user) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.location = location;
        this.user = user;
    }
}
