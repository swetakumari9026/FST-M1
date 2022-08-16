package com.ibm.Selenium;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        driver.getTitle();
      WebElement element = driver.findElement(with(By.tagName("button")).below(By.id("action-confirmation")));
      Actions actions = new Actions(driver);
        actions.moveToElement(element).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = element.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Wait for modal to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));

        //Find username and pasword and fill in the details
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Read the login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);

        //Close browser
        driver.close();

    }
}
