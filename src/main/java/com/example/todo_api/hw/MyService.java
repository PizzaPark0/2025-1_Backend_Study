package com.example.todo_api.hw;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void serviceMethod() {
        System.out.println("service");
        myRepository.repositoryMethod();
    }
}
