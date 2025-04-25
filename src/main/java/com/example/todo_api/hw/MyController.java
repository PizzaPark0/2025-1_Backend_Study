package com.example.todo_api.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void controllerMethod() {
        System.out.println("contoller");
        myService.serviceMethod();
    }
}
