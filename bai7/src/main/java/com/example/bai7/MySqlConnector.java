package com.example.bai7;

public class MySqlConnector extends  DatabaseConnector{
    @Override
    public void connect(){
        System.out.println("đã kết nối với database " + getUrl());
    }
}
