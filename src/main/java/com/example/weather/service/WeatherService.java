package com.example.weather.service;

import com.example.weather.model.Weather;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {
    private final Random random = new Random();

    public Weather getWeather(String city) {
        double temperature = 20 + random.nextDouble() * 10;
        double humidity = 40 + random.nextDouble() * 20;
        return new Weather(city, temperature, humidity);
    }
}
