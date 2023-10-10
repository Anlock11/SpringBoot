package com.example.bai1;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements Oufit{

    @Override
    public void wear() {
        System.out.println("Mac Bikini");
    }
}
