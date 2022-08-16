package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
      Select select = new Select(driver.findElement(By.id("single-select")));
      select.selectByVisibleText("Option 2");
      select.selectByIndex(2);
      select.selectByValue("3");
      select.getOptions().stream().forEach(s-> System.out.println(s.getText()));
      driver.close();

    }
}
