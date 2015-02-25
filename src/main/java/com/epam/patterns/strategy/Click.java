package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click implements ClickingStrategy {
    @Override
    public void clickButton(WebDriver driver, By locator) {
        driver.findElement(locator).click();
        System.out.println("Element with locator"+ locator +" was clicked");
    }
}
