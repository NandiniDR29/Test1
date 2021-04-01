package com.parelles.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
    WebDriver driver;
@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[2]")
private WebElement link;

    public Page2(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;

    }
    public void scrollTillElementVisible() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        js.executeScript("arguments[0].scrollIntoView();",link );

    }
    public void clickonlink()
    {
        link.click();
    }

}
