package com.epam.patterns.decorator;

public class ShipDecorator  extends Ship{

    private Ship decoratedShip;

    public ShipDecorator(Ship decoratedShip) {
        this.decoratedShip = decoratedShip;
    }

    public Ship getDecoratedShip() {
        return decoratedShip;
    }

    public void setDecoratedShip(Ship decoratedShip) {
        this.decoratedShip = decoratedShip;
    }

    public void flight(){
        this.decoratedShip.flight();
    }
}
