package com.example.ai.repository;


import com.example.ai.model.userModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<userModel,String> {
}