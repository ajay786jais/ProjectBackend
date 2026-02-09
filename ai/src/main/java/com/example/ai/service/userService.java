package com.example.ai.service;

import com.example.ai.model.userModel;
import com.example.ai.repository.userRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private final userRepository repository;
    public userService(userRepository repository){
        this.repository = repository;

    }

    public userModel addRequest(userModel user){
        String response="No response";
        user.setResponse(response);
        return repository.save(user);
    }

    public List<userModel> getResponse(){
        return repository.findAll();
    }
}