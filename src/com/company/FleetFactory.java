package com.company;

import com.company.fleet.Driver;
import com.company.fleet.Truck;
import com.company.properties.GPSCoords;

import java.util.ArrayList;
import java.util.List;

public class FleetFactory {

    public static List<Driver> getDrivers() {

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Stefan Beton"));
        drivers.add(new Driver("Larry Borowiecki"));
        drivers.add(new Driver("Francis Taylor",new GPSCoords(43.8,"N",35.1,"S")));

        return drivers;
    }

    public static List<Truck> getTrucks() {

        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("KBR 3221"));
        trucks.add(new Truck("KR 33521"));
        trucks.add(new Truck("KT 73228", new GPSCoords(32.,53.)));

        return trucks;
    }

}
