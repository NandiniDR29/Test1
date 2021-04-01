package com.parelles.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
    WebDriver driver;
    @FindBy(linkText = "/api/users?page=2")
    private WebElement page2link;
    public Page1(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void scrollTillElementVisible()

    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",page2link );

    }
    public void clickonlink()
    {
        page2link.click();
    }
}
