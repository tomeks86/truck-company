package com.company.fleet;

import com.company.properties.GPSCoords;
import com.company.properties.Localizable;

public class Vehicle implements Localizable{

    private GPSCoords coords = new GPSCoords();
    private String id;
    public String requiredPermissions;

    public Vehicle(String id, GPSCoords coords) {
        this.id = id;
        this.coords = coords;
    }

    public Vehicle(String id) {
        this.id = id;
    }

    public void moveVehicle(Driver driver, GPSCoords coords) {
        if (driver.getCoords().compare(this.coords)) {
            if (checkPermissions(driver)) {
                driver.setCoordinates(coords);
                this.coords = coords;
                System.out.println("Driver: " + driver.getName() + " and vehicle: " + this.getId() + " were moved to location: " + coords.presentCoords());
            } else {
                System.out.println("Driver in good position but missing the required persmissions, try another driver or vehicle.");
            }
        } else {
            System.out.println("Driver not in the vehicle position...");
        }
    }

    public String getId() {
        return id;
    }

    public Boolean checkPermissions(Driver driver) {
        boolean driveOK = false;
        if (driver.getPermissions().contains(this.requiredPermissions)) driveOK = true;
        return driveOK;
    }

    public GPSCoords getCoords() {
        return coords;
    }
}
