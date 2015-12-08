package com.epam.patterns.memento;


public class Originator {
    private Element textElement;

    public Originator() {
        this.textElement = new Element();
    }

    public void setText(String text) {
        textElement.clear();
        textElement.sendKeys(text);
    }

    public Memento saveElementText() {
        System.out.println("text saving in memento");
        return new Memento(this.textElement.getText());
    }

    public void restoreFromMemento(Memento memento) {
        textElement.clear();
        textElement.sendKeys(memento.getSavedState());
        System.out.println("text restored from memento");
    }


}
