package com.company;

import com.company.fleet.Bus;
import com.company.fleet.Car;
import com.company.fleet.Driver;
import com.company.fleet.Truck;
import com.company.properties.GPSCoords;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Driver> myDrivers = FleetFactory.getDrivers();
        List<Car> myCars= FleetFactory.getCar();
        List<Truck> myTrucks = FleetFactory.getTrucks();
        List<Bus> myBuses = FleetFactory.getBus();

        System.out.println("My drivers:");
        for (Driver myDriver : myDrivers) {
            System.out.println(myDriver.getName() + " with persissions: " + myDriver.getPermissions() + ", at GPS location: " + myDriver.getCoords().presentCoords());
        }

        System.out.println("");
        System.out.println("My buses:");
        for (Bus myBus : myBuses) {
            System.out.println("Bus with id: " + myBus.getId() + ", with " + myBus.getSeatsNumber() + " seats, at GPS location: " + myBus.getCoords().presentCoords());
        }

        System.out.println("");
        System.out.println("My trucks:");
        for (Truck myTruck : myTrucks) {
            System.out.println("Truck with id: " + myTruck.getId() + ", with " + myTruck.getCapacity() + " t capacity, at GPS location: " + myTruck.getCoords().presentCoords());
        }

        System.out.println("");
        System.out.println("My cars:");
        for (Car myCar : myCars) {
            System.out.println("Car with id: " + myCar.getId() + ", with " + myCar.getTopSpeed() + " kmph top speed, at GPS location: " + myCar.getCoords().presentCoords());
        }

        System.out.println("");
        myTrucks.get(0).moveVehicle(myDrivers.get(0),new GPSCoords(46.,32.));
        myTrucks.get(0).moveVehicle(myDrivers.get(1),new GPSCoords(46.,32.));

        System.out.println("Truck 1 position: " + myTrucks.get(0).getCoords().presentCoords());
        System.out.println("Driver 2 position: " + myDrivers.get(1).getCoords().presentCoords());

    }
}
