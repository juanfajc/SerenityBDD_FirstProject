package com.growth.automation.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class GrowthCreateUser extends PageObject {

    @FindBy(css = "#content h1")
    private WebElementFacade titleNewEmployee;

    @FindBy(id = "employee_first_name")
    private WebElementFacade firstName;

    @FindBy(id = "employee_last_name")
    private WebElementFacade lastName;

    @FindBy(id = "employee_email")
    private WebElementFacade emailText;

    @FindBy(id = "employee_identification")
    private WebElementFacade identification;

    @FindBy(id = "employee_leader_name")
    private WebElementFacade leaderName;

    @FindBy(id = "employee_start_working_on_1i")
    private WebElementFacade yearDropDown;

    @FindBy(id = "employee_start_working_on_2i")
    private WebElementFacade monthDropdown;

    @FindBy(id = "employee_start_working_on_3i")
    private WebElementFacade dayDropDown;

    //Possible css -> "body div.actions > input" or "div.actions > input"
    @FindBy(css = "#content div.actions > input")
    private WebElementFacade saveNewUser;

    @FindBy(css = "#notice")
    private WebElementFacade messageCreation;

    @FindBy(xpath = "//a[.='Back']")
    private WebElementFacade backButton;

    @Step("Validate Create a New profile Form")
    public void validateNewEmployeePage(){
        titleNewEmployee.isPresent();
        String presentTitle = titleNewEmployee.getText();
        System.out.println(presentTitle);
    }

    public void fillCreateNewProfileForm(){
        firstName.type("James");
        lastName.type("Smith");
        emailText.type("james.smith@test.com");
        identification.type("1234567890");
        leaderName.type("Juan Camilo Fajardo");
    }

    @Step("The form is filled with the information")
    public void fillDateNewProfileForm(){
        yearDropDown.selectByValue("2014");
        assertThat(yearDropDown.getSelectedValue(), is("2014"));
        monthDropdown.selectByValue("1");
        assertThat(monthDropdown.getSelectedValue(), is("1"));
        dayDropDown.selectByValue("21");
        assertThat(dayDropDown.getSelectedValue(), is("21"));
    }

    public void clickCreateNewUser(){
        saveNewUser.click();
    }

    @Step("Check the new user was created")
    public void checkNewProfileCreated(){
        String newUser = messageCreation.getText();
        System.out.println(newUser);
        backButton.click();
    }
}
