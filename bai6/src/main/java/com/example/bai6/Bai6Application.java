package com.example.bai6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bai6Application {

    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(Bai6Application.class, args);

      SimpleBean simpleBean = context.getBean(SimpleBean.class);
        System.out.println("Simple Bean Exam: " + simpleBean.toString());



    }

}
