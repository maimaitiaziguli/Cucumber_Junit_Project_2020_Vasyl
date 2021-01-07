package com.vytrack.Step_definitions;

import com.vytrack.pages.CreateCarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateCarStepDefinitions {

    CreateCarPage createCarPage = new CreateCarPage();

    @Given("User clicks on create car button")
    public void user_clicks_on_create_car_button() {
createCarPage.clickOnCreateCar();

    }
    @When("User adds new vehicles information")
    public void user_adds_new_vehicles_information(Map<String, String> dataTable) {


    }


}
