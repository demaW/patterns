package com.epam.patterns.factory;

public class FactoryMain {
    public static void main(String[] args){
        PageFactory factory = new PageFactory();
        Page homePage = factory.getPage("homePage");
        System.out.println(homePage instanceof HomePage);
    }
}
