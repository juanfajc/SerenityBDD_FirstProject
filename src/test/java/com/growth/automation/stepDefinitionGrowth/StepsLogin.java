package com.growth.automation.stepDefinitionGrowth;

import com.growth.automation.basePage.NavigateGrowthLink;
import com.growth.automation.pageObject.GrowthHome;
import com.growth.automation.pageObject.GrowthLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepsLogin {

    @Steps(shared = true)
    NavigateGrowthLink navigateGrowthLink;

    @Steps(shared = true)
    GrowthLogin growthLogin;

    @Steps(shared = true)
    GrowthHome growthHome;

    @Given("^the user can enter in the GAP portal$")
    public void the_user_can_enter_in_the_GAP_portal() {
        navigateGrowthLink.openGrowthPage();
    }

    @When("^the user type the email(.*) and (.*) password$")
    public void the_user_type_the_email_and_password (String user, String password)throws InterruptedException {
        growthLogin.enterEmail(user);
        growthLogin.enterPassword(password);
        growthLogin.clickButton();
    }

    @Then("^the user can validate the logos and the banner$")
    public void the_user_can_validate_the_logos_and_the_banner() {
        growthHome.logoValidation();
    }

}
