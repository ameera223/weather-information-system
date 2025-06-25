package com.example.weather.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class NotificationService {
    private String message;

    public void sendNotification(String city, String msg) {
        this.message = "Alert for " + city + ": " + msg;
        System.out.println(message); // Simulate sending notification
    }

    public String getMessage() {
        return message;
    }
}
