package com.epam.patterns.mediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmartRoomMediator {

    private LightsController lightsController;
    private TemperatureController temperatureController;

    public SmartRoomMediator() {
        initiateSystem();
    }

    private void initiateSystem() {
        lightsController = new LightsController(this);
        temperatureController = new TemperatureController(this);
    }

    public void changedConditionInRoom(Controller controller) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        if (controller instanceof TemperatureController) {
            ((TemperatureController) controller).isTemperatureOptimal();
            System.out.println("Enter temperature as int");
            int temperatureToSet = 23;
            try {
                temperatureToSet = Integer.parseInt(buffer.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            ((TemperatureController) controller).setTemperature(temperatureToSet);
            ((TemperatureController) controller).isTemperatureOptimal();

        }
        if (controller instanceof LightsController) {
            if (((LightsController) controller).isLight() == false) {
                System.out.println("If you want to turn light on type 'yes'");
                String answer = null;
                try {
                    answer = buffer.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (answer.equalsIgnoreCase("yes")) {
                    ((LightsController) controller).lightOn();
                }
                ((LightsController) controller).isLight();
            }
        }
    }

    public LightsController getLightsController() {
        return lightsController;
    }

    public TemperatureController getTemperatureController() {
        return temperatureController;
    }
}
