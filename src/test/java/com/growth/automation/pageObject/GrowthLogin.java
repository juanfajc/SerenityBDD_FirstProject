package com.growth.automation.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class GrowthLogin extends PageObject {

    //Define all WebElements for the Login Page
    @FindBy(id = "user_email")
    private WebElementFacade emailText;

    @FindBy(id = "user_password")
    private WebElementFacade passwordText;

    @FindBy(css = "input.submit")
    private WebElementFacade signInButton;


    //Methods for the Login page
    public void enterEmail(String email) {
        emailText.type(email);
    }

    public void enterPassword(String password){
        passwordText.type(password);
    }

    @Step("The user type the user and password in click in the button")
    public void clickButton()  {
        signInButton.click();
    }

}
