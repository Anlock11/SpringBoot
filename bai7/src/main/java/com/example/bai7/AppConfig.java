package com.example.bai7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${tuananh.mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector databaseConnector(){
        DatabaseConnector mySqlConnector = new MySqlConnector();
        System.out.println("Config mysql url: " + mysqlUrl);
        mySqlConnector.setUrl(mysqlUrl);

        return mySqlConnector;
    }
}
