package com.growth.automation.pageObject;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

public class GrowthUserTable extends PageObject {

    //Those methods help us to know the position where the new profile was created
    //This method get all rows in the tables less the title "th"
    private List<String> getLeaderNameList(){
        return findAll("//tr//td[4]")
                .stream()
                .map(WebElementFacade -> WebElementFacade.getText())
                .collect(Collectors.toList());
    }

    //This method search by name in the list and return the index
    public int getRowLocation(){
        List<String> tableList = getLeaderNameList();
        String search = "Juan Camilo Fajardo";
        int rowNumber = tableList.indexOf(search);
        int newRowValue = rowNumber + 1;
        return newRowValue;
    }

    public void printRowValue(){
        int xpathValue = getRowLocation() + 1;
        int arrayValue = getRowLocation() - 1;
        System.out.println("The position for the WebElement in the table is: " + xpathValue );
        System.out.println("The position for the list is: " + arrayValue);
    }

    //This method check the list and try to get the user that was removed
    @Step("Validate that the user is not in the table")
    public void removeValidation(){
        List<String> removeTable = getLeaderNameList();
        String search = "Juan Camilo Fajardo";
        removeTable.indexOf(search);
        if(removeTable.indexOf(search) < 0){
            System.out.println("The user was removed successfully from the table");
        }
    }

    //-----------------------------------------------------------------------------------------------------//

    //This method get all table
    private List<String> getRowsFromTheTable(){
        return findAll("//tr")
                .stream()
                .map(WebElementFacade -> WebElementFacade.getText())
                .collect(Collectors.toList());
    }

    //This method get the row information with the details that the user used to create
    @Step("Get the Row information for the user that was created")
    public String getValuesFromTheTable(){
        List<String> rowInformation = getRowsFromTheTable();
        String info = rowInformation.get(getRowLocation());
        System.out.println(info);
        return info;
    }

    //Click for remove the user
    @Step("Accept the Aler when the user is removed")
    public void clickRemoveProfile(){
        int removePosition = getRowLocation() + 1;
        WebElement removeClick = getDriver().findElement(By.xpath("//tr[" + removePosition + "]//a[.='Delete']"));
        removeClick.click();
        getAlert().accept();
    }

}



