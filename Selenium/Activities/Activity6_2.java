package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Title of the page is : " + driver.getTitle());

        driver.findElement(By.xpath("//button[contains(@class,'violet')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ajax-content")));

        System.out.println("Message is " + driver.findElement(By.id("ajax-content")).getText());
        wait.until(ExpectedConditions.textMatches(By.id("ajax-content"), Pattern.compile("I'm late!")));

        System.out.println("Message is " + driver.findElement(By.xpath("//div/h3")).getText());
        driver.close();
    }
}
