package com.epam.patterns.abstractfactory;

public class SimpleFactory implements IFactory {

    @Override
    public Buttons getButton() {
        return new SimpleButton();
    }

    @Override
    public Inputs getInputs() {
        return new SimpleInput();
    }
}
