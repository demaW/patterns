package com.epam.patterns.decorator;

public class Ship {
    private String shipCompany;
    private double shipSpeed;

    public void flight(){
        System.out.println("Ship from company " + shipCompany + " can fly with speed " + shipSpeed);
    }

    public String getShipCompany() {
        return shipCompany;
    }

    public void setShipCompany(String shipCompany) {
        this.shipCompany = shipCompany;
    }

    public double getShipSpeed() {
        return shipSpeed;
    }

    public void setShipSpeed(double shipSpeed) {
        this.shipSpeed = shipSpeed;
    }
}
