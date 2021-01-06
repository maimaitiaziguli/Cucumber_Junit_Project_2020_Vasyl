package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCarPage extends BasePage{

    @FindBy(css ="[title='Create Car']")
    private WebElement createCarBtn;

}
