package com.company.properties;

public class GPSCoords {

    private Double longitude;
    private String WE;
    private Double latitude;
    private String NS;

    public GPSCoords() {
        latitude = 49.966718;
        NS = "N";
        longitude = 20.498242;
        WE = "E";
    }

    public GPSCoords(Double longitude, String WE, Double latitude, String NS) {
        this.latitude = latitude;
        this.NS = NS;
        this.longitude = longitude;
        this.WE = WE;
    }

    public GPSCoords(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
        System.out.println("(Eastern Europe - default guess (N, E))");
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
            System.out.println("W/E left unchanged");
            /*System.out.println("guessing that you are in the Eastern Europe - latitude set to E");
            this.WE = "E";*/
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
            System.out.println("N/S left unchanged");
            /*System.out.println("guessing that you are in Europe - latitude set to N");
            NS="N";*/
        }
    }

    public Boolean compare(GPSCoords coords) {
        if (this.getLongitude().equals(coords.getLongitude()) && this.getWE().equals(coords.getWE()) && this.getLatitude().equals(coords.getLatitude()) && this.getNS().equals(coords.getNS())) return true;
        else return false;
    }

    public static void main(String[] args) {
        GPSCoords coor1 = new GPSCoords();
        GPSCoords coor2 = new GPSCoords();
        System.out.println(coor1.compare(coor2));
        System.out.println("coor1 is: " + coor1.presentCoords());
        System.out.println("coor2 is: " + coor2.presentCoords());
        coor1.setNS("S");
        System.out.println(coor1.presentCoords());
        System.out.println(coor1.equals(coor2));
    }

    public String presentCoords() {
        return this.getLatitude() + " " + this.getNS() + " (latitude); " + this.getLongitude() + " " + this.getWE() + " (longitude)";
    }
}
