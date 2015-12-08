package com.epam.patterns.abstractfactory;

public class JSButton extends Button {
    @Override
    public void click() {
        System.out.println("Button was clicked with JS");
    }
}
