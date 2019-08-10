package com.growth.automation.basePage;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class NavigateGrowthLink extends PageObject {

    GrowthLinkPage growthLinkPage;

    //Insctruction for open the link
    @Step("Open Growth Page")
    public void openGrowthPage(){
        growthLinkPage.open();
    }

}
