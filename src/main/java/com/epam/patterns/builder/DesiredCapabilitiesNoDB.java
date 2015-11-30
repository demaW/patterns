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

}
