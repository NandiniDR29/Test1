package com.parelles.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page3 {
     WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/ul/li[1]/a")
    private WebElement element;
    public Page3(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;

    }
    public void scrollTillElementVisible() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(20000);

        js.executeScript("arguments[0].scrollIntoView();",element );

    }
    public void clickonlink()
    {
        element.click();
    }

}
