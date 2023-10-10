package com.example.bai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bai1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Bai1Application.class,args);

        Oufit oufit = context.getBean(Oufit.class);

        System.out.println("mac + " + oufit);
        // use method
        oufit.wear();

        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl yeu cau: " + girl);
        System.out.println("Girl wear: " + girl.oufit);
        System.out.println("Girl wear: " + girl.outfit2);

        girl.oufit.wear();
        girl.outfit2.wear1();

    }

}
