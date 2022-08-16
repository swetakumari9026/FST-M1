package com.ibm.Selenium;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/drag-drop");
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 =  driver.findElement(By.id("dropzone2"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions actions =  new Actions(driver);
        actions.dragAndDrop(ball,drop1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1,"background-color"));
        actions.dragAndDrop(ball,drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2,"background-color"));
        //driver.close();

    }
}
