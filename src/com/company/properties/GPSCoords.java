package com.company.properties;

public class GPSCoords {

    private Double longitude;
    private String WE;
    private Double latitude;
    private String NS;

    public GPSCoords() {
        longitude = 49.966718;
        WE = "E";
        latitude = 20.498242;
        NS = "N";
    }

    public GPSCoords(Double longitude, String WE, Double latitude, String NS) {
        this.longitude = longitude;
        this.WE = WE;
        this.latitude = latitude;
        this.NS = NS;
    }

    public GPSCoords(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
        System.out.println("(Eastern Europe - default guess)");
        NS = "N";
        WE = "E";
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getWE() {
        return WE;
    }

    public void setWE(String WE) {
        if (WE == "N" || NS == "E") {
            this.WE = WE;
        } else {
            System.out.println("guessing that you are in the Eastern Europe - latitude set to E");
            this.WE = "E";
        }
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        if (NS == "N" || NS == "S") {
            this.NS = NS;
        } else {
            System.out.println("guessing that you are in Europe - latitude set to N");
            NS="N";
        }
    }
}
