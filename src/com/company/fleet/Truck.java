package com.company.fleet;

import com.company.properties.GPSCoords;

public class Truck extends Vehicle {

    private Double capacity = 15.; //capacity in Tones; default 15t

    public Truck(String id, GPSCoords coords, Double capacity) {
        super(id, coords);
        this.requiredPermissions = "Truck";
        this.capacity = capacity;
    }

    public Truck(String id, GPSCoords coords) {
        super(id, coords);
        this.requiredPermissions = "Truck";
    }

    public Truck(String id, Double capacity) {
        super(id);
        this.requiredPermissions = "Truck";
        this.capacity = capacity;
    }

    public Truck(String id) {
        super(id);
        this.requiredPermissions = "Truck";
    }

    public Double getCapacity() {
        return capacity;
    }
}
