package com.example.bai1;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
    Oufit oufit;

    @Autowired
    outfit2 outfit2;


    public Girl(Oufit oufit, com.example.bai1.outfit2 outfit2) {
        this.oufit = oufit;
        this.outfit2 = outfit2;
    }

    public Oufit getOufit() {
        return oufit;
    }

    public void setOufit(Oufit oufit) {
        this.oufit = oufit;
    }

    public com.example.bai1.outfit2 getOutfit2() {
        return outfit2;
    }

    public void setOutfit2(com.example.bai1.outfit2 outfit2) {
        this.outfit2 = outfit2;
    }
}
