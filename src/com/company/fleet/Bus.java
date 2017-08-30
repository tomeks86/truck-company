package com.company.fleet;

import com.company.properties.GPSCoords;

public class Bus extends Vehicle {

    private Integer seatsNumber = 30;

    public Bus(String id, GPSCoords coords, Integer seatsNumber) {
        super(id, coords);
        this.requiredPermissions = "Bus";
        this.seatsNumber = seatsNumber;
    }
    public Bus(String id, GPSCoords coords) {
        super(id, coords);
        this.requiredPermissions = "Bus";
    }

    public Bus(String id, Integer seatsNumber) {
        super(id);
        this.requiredPermissions = "Bus";
        this.seatsNumber = seatsNumber;
    }

    public Bus(String id) {
        super(id);
        this.requiredPermissions = "Bus";
    }

    public Integer getSeatsNumber() {
        return seatsNumber;
    }
}
