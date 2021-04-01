package com.qa.tests;

import com.BaseTest;
import com.qa.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.enterUserName();
        lp.enterPassword();
        lp.clickOnLogin();
        Thread.sleep(20000);
    }
}
