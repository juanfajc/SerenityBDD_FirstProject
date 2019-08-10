package com.growth.general;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/com/growth/automation/feature"},
        glue = {"com.growth.automation"}
//        tags = {"@Count_Search"}
)
public class Runner {
}
