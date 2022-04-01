package com.ibm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeClass
    public void startinit(){
        driver = new FirefoxDriver();
        driver.get( "https://alchemy.hguy.co/jobs");
    }

    @Test
    public void testTitle(){
       driver.findElement(By.xpath("//li[1]/a")).click();
       String title = driver.getTitle();
       Assert.assertEquals(title,"Jobs – Alchemy Jobs");
    }

    @AfterClass
    public  void tearDown(){
        driver.close();
    }


}

