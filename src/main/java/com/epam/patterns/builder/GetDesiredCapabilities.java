package com.epam.patterns.builder;

import org.openqa.selenium.remote.DesiredCapabilities;

public class GetDesiredCapabilities {
    private DesiredCapabilitiesBuilder capabilitiesBuilder;

    public void setCapabilitiesBuilder(DesiredCapabilitiesBuilder capabilitiesBuilder){
        this.capabilitiesBuilder = capabilitiesBuilder;
    }

    public DesiredCapabilities getCapabilities(){
        return capabilitiesBuilder.getDCapabilities();
    }

    public void constructCapabilities(){
        capabilitiesBuilder.createDCapabilities();
        capabilitiesBuilder.setJavaScriptCapability();
        capabilitiesBuilder.setDataBaseCapability();
        capabilitiesBuilder.setNativeEventsCapability();
    }
}
