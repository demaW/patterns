package com.epam.patterns.memento;

public class Memento {

    private final String text;

    public Memento(String text) {
        this.text = text;
    }

    public String getSavedState(){
        return text;
    }
}
