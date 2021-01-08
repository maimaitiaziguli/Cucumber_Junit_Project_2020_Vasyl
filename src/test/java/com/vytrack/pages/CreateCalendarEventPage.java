package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarEvent extends BasePage {

    @FindBy(css = "[title='Create Calendar event'])")
    WebElement CreateCalendarEvenButton;

@FindBy(css = "[name='oro_calendar_event_form[title]']")
    WebElement titleInputBox;

@FindBy(css = "[class='mce-content-body ']")
WebElement descriptionInputBox;

    public void CreateCalendarEvenButton(WebElement CreateCalendarEvenButton) {
        CreateCalendarEvenButton = CreateCalendarEvenButton;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(CreateCalendarEvenButton)).click();

    }
    public void enterTitle(String titleInputBox){


    }
}
