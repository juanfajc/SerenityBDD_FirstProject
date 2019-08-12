package com.growth.automation.stepDefinitionGrowth;

import com.growth.automation.basePage.NavigateGrowthLink;
import com.growth.automation.pageObject.GrowthHome;
import com.growth.automation.pageObject.GrowthLogin;
import com.growth.automation.pageObject.GrowthUserTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepsRemoveUser {

    @Steps(shared = true)
    NavigateGrowthLink navigateGrowthLink;

    @Steps(shared = true)
    GrowthLogin growthLogin;

    @Steps(shared = true)
    GrowthHome growthHome;

    @Steps(shared = true)
    GrowthUserTable growthUserTable;


    @Given("^the user enter in the GAP portal with the (.*) email and (.*) password$")
    public void the_user_enter_in_the_GAP_portal_with_the_email_and_password(String email, String password) {
        navigateGrowthLink.openGrowthPage();
        growthLogin.enterEmail(email);
        growthLogin.enterPassword(password);
        growthLogin.clickButton();
        growthHome.logoValidation();
    }


    @When("^the user check the profile created in the table and get the row$")
    public void the_user_check_the_profile_created_in_the_table_and_get_the_row() {
        growthUserTable.getRowLocation();
        growthUserTable.getValuesFromTheTable();
        growthUserTable.printRowValue();
    }

    @Then("^the user can delete the profile$")
    public void the_user_can_delete_the_profile() {
        growthUserTable.clickRemoveProfile();
    }

    @Then("^the user check the profile does not appear in the table$")
    public void the_user_check_the_profile_does_not_appear_in_the_table() {
        growthUserTable.removeValidation();
    }
}
