package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCarPage extends BasePage{

    @FindBy(css ="[title='Create Car']")
    private WebElement createCarBtn;

    public void clickOnCreateCar(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(createCarBtn));
        System.out.println("Clicking on 'Create car button'");


    }



}
