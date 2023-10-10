package com.example.bai2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Bikini")

public class Bikini implements Outfit{

    @Override
    public void wear() {
        System.out.println("đang mặc Bikini");
    }
}
