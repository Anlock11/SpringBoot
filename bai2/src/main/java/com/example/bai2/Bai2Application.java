package com.example.bai2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Bai2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bai2Application.class,args);

        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl yêu cầu : " + girl);
        System.out.println("Girl đang mặc gì ? " + girl.outfit );
        girl.outfit.wear();

    }

}
