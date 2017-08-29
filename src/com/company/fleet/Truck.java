package com.company.fleet;

import com.company.properties.Driveable;
import com.company.properties.Localizable;

public class Truck implements Driveable, Localizable {
    @Override
    public void run() {

    }

    @Override
    public String getDriverName() {
        return null;
    }

    @Override
    public Boolean isDriverPresent() {
        return null;
    }

    @Override
    public Double[] getGPSCoords() {
        return new Double[0];
    }
}
