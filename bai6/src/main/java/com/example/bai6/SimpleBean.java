package com.example.bai6;

public class SimpleBean {
    public String name;

    public SimpleBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Thís ís a simple bean, name: " + name;
    }
}
