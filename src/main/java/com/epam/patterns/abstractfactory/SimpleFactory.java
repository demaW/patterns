package com.epam.patterns.abstractfactory;

public class SimpleFactory implements IFactory {

    @Override
    public Button getButton() {
        return new SimpleButton();
    }

    @Override
    public Inputs getInput() {
        return new SimpleInput();
    }
}
