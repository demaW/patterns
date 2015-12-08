package com.epam.patterns.decorator;

public class FightShip extends ShipDecorator {

    public FightShip(Ship decoratedShip) {
        super(decoratedShip);
    }

    @Override
    public void flight(){
        getDecoratedShip().flight();
        System.out.println("With two heavy plasma guns");
    }
}
