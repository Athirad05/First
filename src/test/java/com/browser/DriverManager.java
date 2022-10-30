package com.browser;

import com.Constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static ThreadLocal<WebDriver>tDriver= new ThreadLocal<>();


    public WebDriver launchBrowser(){
        switch (Constants.browser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                tDriver.set(new ChromeDriver());
                break;
        }
        getDriver().manage().window().maximize();
        return getDriver();

    }

    public WebDriver getDriver(){
        return tDriver.get();
    }





}
