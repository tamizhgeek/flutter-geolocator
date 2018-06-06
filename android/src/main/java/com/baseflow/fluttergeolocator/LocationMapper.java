package com.baseflow.fluttergeolocator;

import android.location.Location;

import java.util.HashMap;
import java.util.Map;

class LocationMapper {

    static Map<String, Double> toHashMap(Location location)
    {
        Map<String, Double> position = new HashMap<>();

        position.put("latitude", location.getLatitude());
        position.put("longitude", location.getLongitude());

        if(location.hasAltitude())
            position.put("altitude", location.getAltitude());
        if(location.hasAccuracy())
            position.put("accuracy", (double) location.getAccuracy());
        if(location.hasBearing())
            position.put("heading", (double) location.getBearing());
        if(location.hasSpeed())
            position.put("speed", (double) location.getSpeed());

        return position;
    }
}