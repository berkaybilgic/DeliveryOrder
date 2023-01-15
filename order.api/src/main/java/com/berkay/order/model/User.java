package com.berkay.order.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User implements Serializable {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("userName")
    private String userName;

    public User() {
    }
    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
