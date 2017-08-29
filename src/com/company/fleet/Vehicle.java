package com.company.fleet;

import com.company.properties.GPSCoords;
import com.company.properties.Localizable;

public class Vehicle implements Localizable{

    private GPSCoords coords = new GPSCoords();
    private String id;

    public Vehicle(String id, GPSCoords coords) {
        this.id = id;
        this.coords = coords;
    }

    public Vehicle(String id) {
        this.id = id;
    }

    public void moveVehicle(Driver driver, GPSCoords coords) {
        if (driver.getCoordinates().compare(this.coords)) {
            driver.setCoordinates(coords);
            this.coords = coords;
            System.out.println("Driver: " + driver.getName() + " and vehicle: " + this.getId() + " were moved to location: " + coords.presentCoords());
        }
    }

    public String getId() {
        return id;
    }
}
