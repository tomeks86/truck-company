package com.company.fleet;

import com.company.properties.GPSCoords;
import com.company.properties.Localizable;

public class Driver implements Localizable {

    private String name;
    private String permissions = "Car";
    private GPSCoords coordinates = new GPSCoords();


    public Driver(String name, GPSCoords coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public Driver(String name, String permissions, GPSCoords coordinates) {
        this.name = name;
        this.permissions = permissions;
        this.coordinates = coordinates;
    }

    public Driver(String name, String permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public Driver(String name) {
        this.name = name;
    }

    public GPSCoords getCoords() {
        return coordinates;
    }

    public void setCoordinates(GPSCoords coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}
