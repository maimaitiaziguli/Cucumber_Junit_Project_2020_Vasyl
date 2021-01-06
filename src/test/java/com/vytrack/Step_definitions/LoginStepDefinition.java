package com.vytrack.Step_definitions;


import com.vytrack.pages.LoginPage;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.junit.Assert;


public class LoginStepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://qa1.vytrack.com");
    }

    @When("User logs in")
    public void user_logs_in() throws InterruptedException {
       Thread.sleep(3000);

    }

    @When("User logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);
    }

    @Then("User should see dashboard page")
    public void user_should_see_dashboard_page() {
       String expected = "Dashboard";
       String actual = loginPage.getPageSubTitleText().trim();
        Assert.assertEquals("Title is not correct",expected,actual);

        System.out.println("I see the dashboard page!");
        Driver.closeDriver();
        //driver.quit();
    }

   //String string = "storemanager85"
    // String string2 = "wrong"
    @When("User logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
      loginPage.login(string , string2);
    }



    @Then("User verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) throws InterruptedException {
String expectedMassage = "string";
String actualMessage = loginPage.getWarningMessageText();
Assert.assertEquals(actualMessage,expectedMassage);

    }




}
