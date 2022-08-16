package com.ibm.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.id("simple")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        //confirmation pop up
        driver.findElement(By.id("confirm")).click();
        System.out.println(alert.getText());
        alert.accept();
        driver.findElement(By.id("confirm")).click();
        alert.dismiss();

        //prompt pop up
        driver.findElement(By.id("prompt")).click();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");

        alert.accept();

    }
}
