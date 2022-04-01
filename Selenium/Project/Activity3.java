package com.ibm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void startinit(){
        driver = new FirefoxDriver();
        driver.get( "https://alchemy.hguy.co/jobs");
    }

    @Test
    public void testimg(){
        String imgUrl =  driver.findElement(By.xpath("//img[@src]")).getText();
        System.out.println("Image url is : " + imgUrl);
    }

    @AfterClass
    public  void tearDown(){
        driver.close();
    }


}
