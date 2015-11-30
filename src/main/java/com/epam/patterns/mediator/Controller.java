package com.epam.patterns.mediator;

public class Controller {
    private final SmartRoomMediator smartRoomMediator;


    public Controller(SmartRoomMediator smartRoomMediator) {
        this.smartRoomMediator = smartRoomMediator;

    }

    public void changedCondition() {
        this.smartRoomMediator.changedConditionInRoom(this);
    }


}
