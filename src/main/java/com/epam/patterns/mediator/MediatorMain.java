package com.epam.patterns.mediator;

public class MediatorMain {
    public static void main(String[] args) {

        SmartRoomMediator smartRoomMediator = new SmartRoomMediator();
        smartRoomMediator.changedConditionInRoom(smartRoomMediator.getLightsController());
        smartRoomMediator.changedConditionInRoom(smartRoomMediator.getTemperatureController());
    }
}
