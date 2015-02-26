package com.epam.patterns.builder;

public class DesiredCapabilitiesNoJS extends DesiredCapabilitiesBuilder {


    @Override
    public void setJavaScriptCapability() {
        capabilities.setCapability("javascriptEnabled", false);
    }

    @Override
    public void setNativeEventsCapability() {
        capabilities.setCapability("nativeEvents", true);
    }

    @Override
    public void setDataBaseCapability() {
        capabilities.setCapability("databaseEnabled", true);
    }
}
