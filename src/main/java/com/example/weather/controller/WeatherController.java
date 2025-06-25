package com.example.weather.controller;

import com.example.weather.model.Weather;
import com.example.weather.service.LocationService;
import com.example.weather.service.NotificationService;
import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WeatherController {

    private final WeatherService weatherService;
    private final LocationService locationService;

    private NotificationService notificationService;

    @Autowired
    public WeatherController(WeatherService weatherService, LocationService locationService) {
        this.weatherService = weatherService;
        this.locationService = locationService;
    }

    // Setter injection for prototype bean
    @Autowired
    public void setNotificationService(ApplicationContext context) {
        this.notificationService = context.getBean(NotificationService.class);
    }

    @GetMapping("/weather/{city}")
    public Weather getWeather(@PathVariable String city) {
        return ResponseEntity.ok(weatherService.getWeather(city)).getBody();
    }

    @PostMapping("/alerts")
    public ResponseEntity<String> sendAlert(@RequestParam String city, @RequestBody String msg) {
        notificationService.sendNotification(city, msg);
        return ResponseEntity.ok(NotificationService.getMessage());
    }
}
