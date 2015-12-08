package com.epam.patterns.decorator;

public class PassengerShip extends ShipDecorator {
    public PassengerShip(Ship decoratedShip) {
        super(decoratedShip);
    }

    @Override
    public void flight(){
        this.getDecoratedShip().flight();
        System.out.println("With 20 passenger seats");
    }
}
