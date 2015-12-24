package com.epam.patterns.proxy;


public abstract class Element {

    protected String locator;

    public Element(String locator) {
        this.locator = locator;
    }

    public abstract void click();

    public String getLocator(){
        return locator;
    }

    public abstract void doubleClick();

}
