package com.epam.patterns.abstractfactory;

public class SimpleButton extends Button {
    @Override
    public void click() {
        System.out.println("Button was clicked");
    }
}
