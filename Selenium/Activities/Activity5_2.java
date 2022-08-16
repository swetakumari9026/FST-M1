package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls ");
        String title = driver.getTitle();
        System.out.println("Tilte of page is "+ title);
        WebElement e = driver.findElement(By.id("dynamicText"));
        if(!e.isEnabled())
        {
            driver.findElement(By.id("toggleInput")).click();
            System.out.println("The checkbox is selected: " + e.isEnabled());
        }
        driver.close();
    }
}
