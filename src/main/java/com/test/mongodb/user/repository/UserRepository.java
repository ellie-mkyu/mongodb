package com.test.mongodb.user.repository;

import com.test.mongodb.user.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
