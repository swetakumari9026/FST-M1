package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.training-support.net/selenium/iframes");
            driver.switchTo().frame(1);
            System.out.println(driver.findElement(By.id("actionButton")));
            WebElement button1 = driver.findElement(By.cssSelector("button"));
            System.out.println(button1.getText());
            System.out.println(button1.getCssValue("background-color"));
            button1.click();
        }
}
