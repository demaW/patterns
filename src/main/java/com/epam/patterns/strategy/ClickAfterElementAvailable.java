package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAfterElementAvailable implements ClickingStrategy {
    @Override
    public void clickButton(WebDriver driver, By locator) {
        WebElement element = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(locator));
        element.click();
        System.out.println("Element with locator"+ locator +" was clicked after wait");
    }
}
