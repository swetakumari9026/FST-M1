package com.ibm.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");
        String title  = driver.getTitle();
        System.out.println("Title of page is "+ title);

        driver.findElement(By.id("firstName")).sendKeys("Sweta");
        driver.findElement(By.id("lastName")).sendKeys("Kumari");
        driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
        driver.findElement(By.xpath("//div[@class='field']/input[@type='submit']")).click();
        driver.switchTo().alert().accept();
        driver.close();

    }
}
