package com.example.weather.model;

public class Weather {
    private String city;
    private double temperature;
    private double humidity;

    public Weather(String city, double temperature, double humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getCity() { return city; }
    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }
}
