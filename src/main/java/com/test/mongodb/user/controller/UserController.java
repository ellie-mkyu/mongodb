package com.test.mongodb.user.controller;

import com.test.mongodb.user.dto.UserRequest;
import com.test.mongodb.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping()
    public String insert(@RequestBody UserRequest request) {
        service.insert(request);
        return "ok";
    }


}
