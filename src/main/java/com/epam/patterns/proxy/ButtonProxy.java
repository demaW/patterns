package com.epam.patterns.proxy;
//this is example of protocol proxy


import com.epam.patterns.utils.Logger;

public class ButtonProxy extends Element{

    Button button;

    public ButtonProxy(String locator) {
        super(locator);
    }

    @Override
    public void click() {
        Logger.out.info("Click will be performed");
        button = new Button(locator);
        button.click();
    }

    @Override
    public void doubleClick() {
        Logger.out.info("Double click will be performed");
        button = new Button(locator);
        button.doubleClick();
    }
}
