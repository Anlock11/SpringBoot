package com.example.bai2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Naked")

public class Naked implements Outfit{
    @Override
    public void wear() {
        System.out.println("Không mặc gì");
    }
}
