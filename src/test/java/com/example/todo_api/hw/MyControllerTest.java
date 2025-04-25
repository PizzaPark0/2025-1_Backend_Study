package com.example.todo_api.hw;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
public class MyControllerTest {
    ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

    @Autowired
    MyController myController;

    @Test
    void checkAllBeans() {
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

    @Test
    public void controllerTest() {
        myController.controllerMethod();
    }
}
