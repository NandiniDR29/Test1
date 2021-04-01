package com;

import com.qa.utils.ConstantsContexts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest extends ConstantsContexts {
    public WebDriver driver;
    public static Properties prop;

    @BeforeMethod()
    public void preConditions() throws IOException {
        System.setProperty(CHROME_KEY, browserPath);
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("browserName", "chrome");
//        try {
//            System.out.println("connect to remote web driver");
//            driver = new RemoteWebDriver(new URL("http://13.233.159.41:4444//wd/hub"), cap);
//        }catch(MalformedURLException e){
//            e.printStackTrace();
//        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1500,700");
        driver = new ChromeDriver();
        prop=new Properties();
        prop.load(new FileInputStream("src/main/resources/config/config.properties"));
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(pageLoadWait,TimeUnit.SECONDS);
        driver.get(prop.getProperty("Url"));

    }
    @AfterMethod()
    public void postConditions(){
        driver.close();
    }

}
