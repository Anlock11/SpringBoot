package com.example.bai2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Suit")

public class Suit implements Outfit{

    @Override
    public void wear() {
        System.out.println("Mặc vét");
    }
}
