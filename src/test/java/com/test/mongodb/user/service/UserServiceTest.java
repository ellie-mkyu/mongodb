package com.test.mongodb.user.service;

import com.test.mongodb.user.entity.UserEntity;
import com.test.mongodb.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserRepository repository;

    @Test
    void insert() {
        repository.insert(
                UserEntity.create("test", "address")
        );
    }
}