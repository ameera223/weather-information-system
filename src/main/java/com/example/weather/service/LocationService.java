package com.example.weather.service;

import com.example.weather.model.Location;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LocationService {
    private final Map<String, Location> locations = new HashMap<>();

    public LocationService() {
        locations.put("Delhi", new Location("Delhi", "India"));
        locations.put("Paris", new Location("Paris", "France"));
    }

    public Location getLocation(String city) {
        return locations.getOrDefault(city, new Location(city, "Unknown"));
    }
}
