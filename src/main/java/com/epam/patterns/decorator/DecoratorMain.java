package com.epam.patterns.decorator;

public class DecoratorMain {

    public static void main(String[] args){
        FightShip falconFightShip = new FightShip(new FalconInnShip());

        falconFightShip.flight();

        PassengerShip passengerMilestoneShip = new PassengerShip(new MilestoneInnShip());
        passengerMilestoneShip.flight();
    }

}
