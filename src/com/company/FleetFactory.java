package com.company;

import com.company.fleet.Bus;
import com.company.fleet.Car;
import com.company.fleet.Driver;
import com.company.fleet.Truck;
import com.company.properties.GPSCoords;

import java.util.ArrayList;
import java.util.List;

public class FleetFactory {

    public static List<Driver> getDrivers() {

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Stefan Beton","Car Bus"));
        drivers.add(new Driver("Larry Borowiecki", "Truck Bus Car"));
        drivers.add(new Driver("Francis Taylor",new GPSCoords(43.8,"N",35.1,"S")));

        return drivers;
    }

    public static List<Truck> getTrucks() {

        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("KBR 3221", 34.));
        trucks.add(new Truck("KR 33521", 50.));
        trucks.add(new Truck("KT 73228", new GPSCoords(32.,53.)));

        return trucks;
    }

    public static List<Bus> getBus() {

        List<Bus> bus = new ArrayList<>();
        bus.add(new Bus("KWI 32791", 32));
        bus.add(new Bus("RMI 32791", 60));

        return bus;
    }

    public static List<Car> getCar() {

        List<Car> car = new ArrayList<>();
        car.add(new Car("KT 13743", 190.));
        car.add(new Car("KOS 16843", 160.));

        return car;
    }

}
