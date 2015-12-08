package com.epam.patterns.memento;

public class Element {

    private String text;

    public Element() {
        this.text = "";
    }

    public void clear() {
        this.text = "";
        System.out.println("Element cleared");
    }

    public void sendKeys(String text) {
        this.text = text;
        System.out.println("Now text is: " + this.text);
    }

    public String getText() {
        return text;
    }
}
