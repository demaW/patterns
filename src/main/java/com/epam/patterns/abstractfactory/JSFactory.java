package com.epam.patterns.abstractfactory;

public class JSFactory implements IFactory {
    @Override
    public Button getButton() {
        return new JSButton();
    }

    @Override
    public Inputs getInput() {
        return new JSInput();
    }
}
