package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls ");
        String title = driver.getTitle();
        System.out.println("Tilte of page is "+ title);
        WebElement e = driver.findElement(By.className("willDisappear"));
        e.click();
        if(e.isDisplayed())
        {
            driver.findElement(By.id("toggleCheckbox")).click();
        }

    }
}
