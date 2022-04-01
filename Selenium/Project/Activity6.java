package com.ibm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Activity6 {
    WebDriver driver;

    @BeforeClass
    public void startinit(){
        driver = new FirefoxDriver();
        driver.get( "https://alchemy.hguy.co/jobs");
    }

    @Test
    public void testApplyJob() throws InterruptedException {
        driver.findElement(By.xpath("//li[1]/a")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Jobs – Alchemy Jobs");
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");
        driver.findElement(By.xpath("//div[@class='search_submit']/input")).click();
        List<WebElement> listOfJob = driver.findElements(By.xpath("//ul[@class='job_listings']/li"));
        Thread.sleep(10000);
        listOfJob.get(1).click();
        driver.findElement(By.xpath("//input[starts-with(@class,'application_button')]")).click();
        String email = driver.findElement(By.xpath("//div[@class='application_details']")).getText();
        String[] emailprint = email.split(" ");
        System.out.println("Email is "+ emailprint[emailprint.length-1]);
    }

    @AfterClass
    public  void tearDown(){
        driver.close();
    }
}
