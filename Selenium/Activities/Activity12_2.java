package com.ibm.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        //   String title = driver.findElement(By.xpath("//div[@class='sub header']")).getText();
        // System.out.println("title of frame is " + title);

        String getsou = driver.getPageSource();
        System.out.println("page source" + getsou);

         /*   driver.switchTo().frame(1);
                String title2 = driver.findElement(By.xpath("//div[@class='sub header']")).getText();
               System.out.println("title of frame is " + title2);
            }*/

    }}


