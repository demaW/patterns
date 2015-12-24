package com.epam.patterns.proxy;

public class ProxyMain {
    public static void main(String[] args){
        ButtonProxy buttonProxy = new ButtonProxy("Locator of element");

        buttonProxy.click();

        buttonProxy.doubleClick();

    }
}
