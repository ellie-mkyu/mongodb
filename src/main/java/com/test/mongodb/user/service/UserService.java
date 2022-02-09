package com.test.mongodb.user.service;

import com.test.mongodb.user.dto.UserRequest;
import com.test.mongodb.user.entity.UserEntity;
import com.test.mongodb.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(
            UserRepository repository
    ){
        this.repository = repository;
    }

    public void insert(UserRequest request) {
        repository.insert(
            UserEntity.create(
                    request.getName(),
                    request.getAddress()
            )
        );
    }
}
