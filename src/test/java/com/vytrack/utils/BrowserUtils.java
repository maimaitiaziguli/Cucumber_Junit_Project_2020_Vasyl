package com.vytrack.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnElement(WebElement element) {
       wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        }

       public static void  clickWithJS(WebElement element){
           ((JavascriptExecutor)(Driver.getDriver())).executeScript("arguments[0].click()",element);
           wait.until(ExpectedConditions.elementToBeClickable(element));

       }

    }





