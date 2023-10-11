package com.example.bai7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bai7Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bai7Application.class, args);
        DatabaseConnector databaseConnector = context.getBean(DatabaseConnector.class);
        databaseConnector.connect();

    }

}
