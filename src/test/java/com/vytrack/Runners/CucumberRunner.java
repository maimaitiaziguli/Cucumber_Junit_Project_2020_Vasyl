package com.vytrack.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
          "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/vytrack/Step_definitions",
        dryRun = false,
        tags = "@add_car_scenario_outline",
        publish = true
)


public class CucumberRunner {

}
