package com.epam.patterns.abstractfactory;

public class JSFactory implements IFactory {
    @Override
    public Buttons getButton() {
        return new JSButton();
    }

    @Override
    public Inputs getInputs() {
        return new JSInput();
    }
}
