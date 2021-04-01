package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id= "user")
    private WebElement userName;
    @FindBy(id = "pass")
    private WebElement passWord;
    @FindBy(id = "login_submit")
    private WebElement loginBtn;
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }
    public void enterUserName()
    {
        System.out.println("enetr user name");

        userName.sendKeys("");
    }
    public void enterPassword(){
        System.out.println("enetr pass");

        passWord.sendKeys("");
    }
    public void clickOnLogin(){
        System.out.println(" click on login");
        loginBtn.click();
    }
}
