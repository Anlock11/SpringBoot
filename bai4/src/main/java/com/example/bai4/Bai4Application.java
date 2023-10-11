package com.example.bai4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bai4Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bai4Application.class, args);
        // Lấy ra bean GirlService
        GirlService girlService = context.getBean(GirlService.class);
        // Lấu ra random một cô gái từ tầng service
        Girl girl = girlService.getRadomGirl();
        // In ra màn hình
        System.out.println(girl);



    }

}
