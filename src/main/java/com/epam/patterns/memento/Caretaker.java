package com.epam.patterns.memento;

import java.util.Stack;

public class Caretaker{
    private static final  Originator originator = new Originator();
    private static final Stack<Memento> mementoStack = new Stack<Memento>();

    public static void main(String[] args){
        originator.setText("text1");
        mementoStack.add(originator.saveElementText());
        originator.setText("text2");
        originator.setText("text3");
        mementoStack.add(originator.saveElementText());
        originator.restoreFromMemento(mementoStack.pop());
        originator.restoreFromMemento(mementoStack.pop());
    }

}
