package com.bootcoding.java.OOPS.Encapsulation;

public class Ambulance {

    private String hospitalName;
    private String type;
    private double charges;
    private boolean isAvailable;

    // To assign value - use setter
    // To get value - use getter

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
