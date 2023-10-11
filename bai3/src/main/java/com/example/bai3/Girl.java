package com.example.bai3;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    @PostConstruct
    public void postContruc(){
        System.out.println("In post contructor");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println(" in predestroy");
    }
}
