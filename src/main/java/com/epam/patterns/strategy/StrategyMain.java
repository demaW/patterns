package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StrategyMain {


    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wikipedia.org/");
        By locator = By.xpath("//form[@class='search-form']//input[@class='formBtn']");

        ActionClick click = new ActionClick(driver,locator);
        click.performClick();
        driver.get("https://www.wikipedia.org/");
        click.changeStrategy(new ClickAfterElementAvailable());
        click.performClick();
        driver.quit();
        System.exit(0);
   }


}
