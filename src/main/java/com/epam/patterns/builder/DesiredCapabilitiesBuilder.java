package com.epam.patterns.builder;

import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class DesiredCapabilitiesBuilder {
    protected DesiredCapabilities capabilities;

    public void createDCapabilities() {
        capabilities = new DesiredCapabilities();
    }

    public DesiredCapabilities getDCapabilities() {
        return capabilities;
    }

    public abstract void setJavaScriptCapability();

    public abstract void setNativeEventsCapability();

    public abstract void setDataBaseCapability();
}
