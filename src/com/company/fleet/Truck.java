package com.company.fleet;

import com.company.properties.GPSCoords;
import com.company.properties.Localizable;

public class Truck extends Vehicle {

    public Truck(String id, GPSCoords coords) {
        super(id, coords);
    }

    public Truck(String id) {
        super(id);
    }
}
