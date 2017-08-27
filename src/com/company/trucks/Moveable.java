package com.company.trucks;

public interface Moveable {
    public void run();
    public String getDriverName();
    public Boolean isDriverPresent();
    public Double[] getGPSCoords();
}
