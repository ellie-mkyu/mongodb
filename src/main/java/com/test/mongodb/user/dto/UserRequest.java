package com.test.mongodb.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserRequest {

    private final String name;
    private final String address;

    @Builder
    public UserRequest(
            String name,
            String address
    ){
        this.name = name;
        this.address = address;
    }


}
