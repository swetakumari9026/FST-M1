package com.ibm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;

    @BeforeClass
    public void startinit(){
        driver = new FirefoxDriver();
        driver.get( "https://alchemy.hguy.co/jobs");
    }

    @Test
    public void postJob(){
        driver.findElement(By.xpath("//ul/li[3]")).click();
        driver.findElement(By.xpath("//form/fieldset[2]/div/input")).sendKeys("sweta.kumari1@gmail.com");
        driver.findElement(By.xpath("//form/fieldset[3]/div/input")).sendKeys("Software Testing");
        driver.findElement(By.xpath("//form/fieldset[4]/div/input")).sendKeys("Landon");
        Select select = new Select(driver.findElement(By.id("job_type")));
        select.selectByIndex(1);

        driver.switchTo().frame(driver.findElement(By.id("job_description_ifr")));

        driver.findElement(By.id("tinymce")).sendKeys("Selenium ");
        driver.switchTo().parentFrame();

        driver.findElement(By.id("application")).sendKeys("sweta.kumari1@gmail.com");
        driver.findElement(By.id("company_name")).sendKeys("IBM");
        driver.findElement(By.name("submit_job")).click();
        driver.findElement(By.id("job_preview_submit_button")).click();

        driver.findElement(By.xpath("//ul[@id='primary-menu']/li[1]")).click();

        driver.findElements(By.xpath("//ul[@class='job_listings']/li"))
                .stream().forEach(x-> {
                    Assert.assertTrue(x.getText().equalsIgnoreCase("Software Testing"));
                });

        driver.close();

    }

}
