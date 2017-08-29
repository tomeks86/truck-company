package com.company.fleet;

import com.company.properties.GPSCoords;
import com.company.properties.Localizable;

public class Bus extends Vehicle {

    public Bus(String id, GPSCoords coords) {
        super(id, coords);
    }

    public Bus(String id) {
        super(id);
    }
}
