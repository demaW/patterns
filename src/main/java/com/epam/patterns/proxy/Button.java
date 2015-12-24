package com.epam.patterns.proxy;

public class Button extends Element {

    public Button(String locator) {
        super(locator);
    }

    @Override
    public void click() {
        System.out.println("click");
    }

    @Override
    public String getLocator() {
        System.out.println("Locator is: " + locator);
        return locator;
    }

    @Override
    public void doubleClick() {
        System.out.println("double click");
    }
}
