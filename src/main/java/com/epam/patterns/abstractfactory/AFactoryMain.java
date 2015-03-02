package com.epam.patterns.abstractfactory;

public class AFactoryMain {
    public static void main(String[] args){
        IFactory simpleFactory = new SimpleFactory();
        IFactory jsFactory = new JSFactory();

        Buttons button = simpleFactory.getButton();
        System.out.println(button instanceof SimpleButton);
    }
}
