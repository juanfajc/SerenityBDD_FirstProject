package com.growth.automation.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class GrowthHome extends PageObject {

    //Icons
    @FindBy(css = "#logo")
    private WebElementFacade logoSite;

    @FindBy(css = ".flash_notice")
    private WebElementFacade logoBanner;

    @FindBy(css = "#logo_text")
    private WebElementFacade userElement;

    @FindBy(css = "a[href='/employees/new']")
    private WebElementFacade createUser;

    //Methods for validation
    @Step("The user can check the login icons and the get the banner value")
    public void logoValidation(){
        logoSite.isPresent();
        userElement.isPresent();
        logoBanner.isPresent();
        String bannerValue = logoBanner.getText();
        System.out.println(bannerValue);
    }


    //Steps for creation user
    public void clickCreateUser(){
        createUser.click();
    }
}
