package com.epam.patterns.builder;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesNoDB extends DesiredCapabilitiesBuilder {

    @Override
    public void setJavaScriptCapability() {
        capabilities.setCapability("javascriptEnabled", true);
    }

    @Override
    public void setNativeEventsCapability() {
        capabilities.setCapability("nativeEvents", true);
    }

    @Override
    public void setDataBaseCapability() {
        capabilities.setCapability("databaseEnabled", false);
    }

    public static class BuilderMain {
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
}
