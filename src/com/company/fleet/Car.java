package com.company.fleet;

import com.company.properties.GPSCoords;

public class Car extends Vehicle {

    private Double topSpeed = 150.;

    public Car(String id, GPSCoords coords, Double topSpeed) {
        super(id, coords);
        requiredPermissions = "Car";
        this.topSpeed = topSpeed;
    }

    public Car(String id, GPSCoords coords) {
        super(id, coords);
        requiredPermissions = "Car";
    }

    public Car(String id) {
        super(id);
        requiredPermissions = "Car";
    }

    public Car(String id, Double topSpeed) {
        super(id);
        requiredPermissions = "Car";
        this.topSpeed = topSpeed;
    }

    public Double getTopSpeed() {
        return topSpeed;
    }
}
