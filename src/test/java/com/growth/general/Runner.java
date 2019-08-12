package com.growth.general;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/com/growth/automation/feature"},
        glue = {"com.growth.automation"}
//        tags = {"@Remove_User"}
//Notes: The correct way to run the project is setting up tags as a comments and run as maven project in order to get the Serenity BDD report
//The tags help us to run every single cucumber test created in the feature file
//The tags are: ("@LoginUser"), ("@Create_User") and ("@Remove_User")
)
public class Runner {
}
