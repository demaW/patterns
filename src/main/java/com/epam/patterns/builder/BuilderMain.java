package com.epam.patterns.builder;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BuilderMain {
    public static void main(String[] args){
        DesiredCapabilitiesNoDB capabilitiesNoDB = new DesiredCapabilitiesNoDB();

        GetDesiredCapabilities capabilities = new GetDesiredCapabilities();

        capabilities.setCapabilitiesBuilder(capabilitiesNoDB);
        capabilities.constructCapabilities();

        DesiredCapabilities desiredCapabilities = capabilities.getCapabilities();
        System.out.println("Desired Capabilities without data base was build: ");
        System.out.println("\tDataBase status: " + desiredCapabilities.getCapability("databaseEnabled"));
        System.out.println("\tJavascript status: " + desiredCapabilities.getCapability("javascriptEnabled"));

        DesiredCapabilitiesNoJS capabilitiesNoJS = new DesiredCapabilitiesNoJS();

        capabilities.setCapabilitiesBuilder(capabilitiesNoJS);
        capabilities.constructCapabilities();
        desiredCapabilities = capabilities.getCapabilities();

        System.out.println("\nDesired Capabilities without javascript was build: ");
        System.out.println("\tDataBase status: " + desiredCapabilities.getCapability("databaseEnabled"));
        System.out.println("\tJavascript status: " + desiredCapabilities.getCapability("javascriptEnabled"));
    }
}
