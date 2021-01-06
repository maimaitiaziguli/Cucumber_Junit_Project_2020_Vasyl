package com.vytrack.Step_definitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

/* For example: SuiteSetUpAndTearDown
Hooks triggered based on tags, not class name or their locations
These methods can be a part of any step definition class
Common practice is to store them in the separate class
 */


public class Hooks {

    // hook Before = @BeforeMethod in TestNG
    // hook After = @AfterMethod in TestNG
    // it is not good idea to mix implicit and explicit
    // -waits. It can lead to unexpected long waits.

    @Before
    public void setup (Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(":::Starting automation:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    // this hook will run only before scenarios with a tag @db
    @Before("@db")
    public void dbSetup(){
        System.out.println(":::connecting to database");
    }

    @After("@db")
    public void dbTearDown(){
        System.out.println(":::Disconnecting from database:::");
    }




   @After
   public void tearDown(){

       // close browser, close DB connections, close tunnel, capture screenshot of the error,etc..
       // this is a hook after
       // runs automaticly after every test
       Driver.closeDriver();
       System.out.println("****** End of test exacution******");
   }

}
