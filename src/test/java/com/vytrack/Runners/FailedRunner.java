package com.vytrack.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   glue = "com/vytrack/Step_definitions",
   features = "@target/rerun.txt"
)

public class FailedRunner {
}
