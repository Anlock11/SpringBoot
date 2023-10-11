package com.example.bai6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    SimpleBean simpleBean(){
        // Khởi tạo một instance của SimpleBean và trả ra ngoài
        return new SimpleBean("tuan anh");
    }
}
