package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page " + driver.getTitle());

        WebElement leftclick = driver.findElement(By.id("wrapD3Cube"));
        Actions clickAction = new Actions(driver);
        clickAction.click().build().perform();

        System.out.println("Left click "+leftclick.getText());

        clickAction.doubleClick(leftclick).build().perform();

        System.out.println("Double click "+leftclick.getText());

    }
}
