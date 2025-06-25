package com.example.weather.config;

import com.example.weather.service.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public NotificationService notificationService() {
        return new NotificationService();
    }
}
