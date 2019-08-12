package com.growth.automation.stepDefinitionGrowth;

import com.growth.automation.basePage.NavigateGrowthLink;
import com.growth.automation.pageObject.GrowthCreateUser;
import com.growth.automation.pageObject.GrowthHome;
import com.growth.automation.pageObject.GrowthLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepsCreateUser {

    @Steps(shared = true)
    NavigateGrowthLink navigateGrowthLink;

    @Steps(shared = true)
    GrowthLogin growthLogin;

    @Steps(shared = true)
    GrowthHome growthHome;

    @Steps(shared = true)
    GrowthCreateUser growthCreateUser;

    @Given("^the user can enter in the GAP portal with the (.*) email and (.*) password$")
    public void the_user_can_enter_in_the_GAP_portal_with_the_email_and_password (String email, String password) {
        navigateGrowthLink.openGrowthPage();
        growthLogin.enterEmail(email);
        growthLogin.enterPassword(password);
        growthLogin.clickButton();
    }

    @When("^the user create a new profile in the portal$")
    public void the_user_have_to_create_a_new_profile_in_the_portal() {
        growthHome.logoValidation();
        growthHome.clickCreateUser();
        growthCreateUser.validateNewEmployeePage();
        growthCreateUser.fillCreateNewProfileForm();
        growthCreateUser.fillDateNewProfileForm();
        growthCreateUser.clickCreateNewUser();

    }

    @Then("^the user could check the new profile was created$")
    public void the_user_could_check_the_new_profile_was_created() {
        growthCreateUser.checkNewProfileCreated();
    }

}
