package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expenses {

    public Expenses(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//li[@style='display: block;'])[17]")
    public WebElement expensesPage;
}
