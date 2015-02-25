package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ClickingStrategy {
    public void clickButton(WebDriver driver,By locator);
}
