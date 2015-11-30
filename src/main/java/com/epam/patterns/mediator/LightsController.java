package com.epam.patterns.mediator;

public class LightsController extends Controller {

    private boolean light;

    public LightsController(SmartRoomMediator smartRoomMediator) {
        super(smartRoomMediator);
    }


    public void lightOn() {
        light = true;
        System.out.println("The light is on");
    }

    public void lightOff() {
        light = false;
        System.out.println("The light is off");
    }

    public boolean isLight() {
        if (light == true) {
            System.out.println("Light is on");

        } else {
            System.out.println("Light is off");
        }
        return light;
    }

}
