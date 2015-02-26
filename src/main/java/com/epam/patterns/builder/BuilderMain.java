package com.epam.patterns.builder;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BuilderMain {
    public static void main(String[] args){
        DesiredCapabilitiesNoDB capabilitiesNoDB = new DesiredCapabilitiesNoDB();

        GetDesiredCapabilities capabilities = new GetDesiredCapabilities();

        capabilities.setCapabilitiesBuilder(capabilitiesNoDB);

        capabilities.constructCapabilities();

        DesiredCapabilities desiredCapabilities = capabilities.getCapabilities();

        System.out.println("DataBase status:" + desiredCapabilities.getCapability("databaseEnabled"));
        System.out.println("Javascript status:" + desiredCapabilities.getCapability("javascriptEnabled"));
    }
}
