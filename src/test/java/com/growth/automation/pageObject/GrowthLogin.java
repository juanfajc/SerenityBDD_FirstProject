package com.growth.automation.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GrowthLogin extends PageObject {

    //Define all WebElements for the Login Page
    @FindBy(id = "user_email")
    private WebElementFacade emailText;

    @FindBy(id = "user_password")
    private WebElementFacade passwordText;

    @FindBy(name = "commit")
    private WebElementFacade signInButton;


    //Methods for the Login page
    public void enterEmail(String email){
        emailText.type("gap-automationtest@mailinator.com");
    }

    public void enterPassword(String password){
        passwordText.type("password");
    }

    public void clickButton(){
        signInButton.click();
    }

}
