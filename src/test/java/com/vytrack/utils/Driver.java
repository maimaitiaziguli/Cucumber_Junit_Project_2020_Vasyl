package com.vytrack.utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {


    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){

            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                    break;
                case "remote-chrome": // from this line this block is for SELENIUM GRID
                    //ChromeOptions chromeOptions = new ChromeOptions();
                    try {
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setBrowserName("chrome");
                    URL gridUrl = new URL("http://54.237.215.181:4444/wed/hub");
                    driver = new RemoteWebDriver(gridUrl, desiredCapabilities);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                default:
                    throw new RuntimeException("no such a browser yet!");
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver = null;
        }
    }


}
