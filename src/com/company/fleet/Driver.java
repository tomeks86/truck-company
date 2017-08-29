package com.company.fleet;

import com.company.properties.GPSCoords;
import com.company.properties.Localizable;

public class Driver implements Localizable {

    private String name;
    private GPSCoords coordinates = new GPSCoords();


    public Driver(String name, GPSCoords coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public Driver(String name) {
        this.name = name;
    }

    public GPSCoords getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(GPSCoords coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }
}
