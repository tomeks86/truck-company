package com.company.properties;

public interface Localizable {

    GPSCoords actualPosition = new GPSCoords();

    static void getGPSCoords(){
        System.out.println("Current GPS position: " + actualPosition.getLatitude() + " (" + actualPosition.getNS() + ") (latitude), " + actualPosition.getLongitude() + " (" + actualPosition.getWE() + ") (longitude)");
    }

    static void changeCoordsTo(double x, double y) {
        actualPosition.setLatitude(x);
        actualPosition.setLongitude(y);
    }

    static void changeCoordsTo(double x, String NS, double y, String WE) {
        actualPosition.setLatitude(x);
        actualPosition.setNS(NS);
        actualPosition.setLongitude(y);
        actualPosition.setWE(WE);
    }

}
