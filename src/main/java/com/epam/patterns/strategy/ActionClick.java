package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionClick {
    private ClickingStrategy clickingStrategy = new Click();
    private WebDriver driver;
    private By locator;

    public ActionClick(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

    public void performClick(){
        clickingStrategy.clickButton(this.driver,this.locator);
    }

    public void changeStrategy(ClickingStrategy clickingStrategyNew){
        clickingStrategy = clickingStrategyNew;

    }
}
