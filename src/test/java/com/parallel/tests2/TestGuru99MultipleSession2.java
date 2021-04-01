package com.parallel.tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.qa.utils.ConstantsContexts.browserPath;

public class TestGuru99MultipleSession2 {
    public  WebDriver driver;
    @BeforeTest
    public void executeSessionTwo(){
        //Second session of WebDriver
        System.setProperty("webdriver.chrome.driver",browserPath);
         driver = new ChromeDriver();
        //Goto guru99 site
        driver.get(" http://thedemosite.co.uk/");
        //find user name text box and fill it
    }

}
