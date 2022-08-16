package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("action-confirmation"))));
        driver.close();
    }
}
