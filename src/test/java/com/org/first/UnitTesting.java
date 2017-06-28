package com.org.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by E003690 on 6/28/2017.
 */
public class UnitTesting {

    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\E003690\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    /**
     * Test to verify build for each check in
     */
    @Test
    public void verifyLoginPage(){
       driver.get("https://accounts.google.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
