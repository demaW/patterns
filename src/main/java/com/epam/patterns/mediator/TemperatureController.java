package com.epam.patterns.mediator;

public class TemperatureController extends Controller {
    private int temperature;
    private final static int optimalTemperature = 23;

    public TemperatureController(SmartRoomMediator smartRoomMediator) {
        super(smartRoomMediator);
        this.temperature = 20;
    }

    public boolean isTemperatureOptimal() {
        if (temperature == optimalTemperature) {
            System.out.println("Temperature is optimal");
            return true;
        }
        System.out.println("Temperature is not optimal. Optimal temperature is 23. Currently " + this.temperature);
        return false;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature was set to " + temperature + " degrees");
    }
}
