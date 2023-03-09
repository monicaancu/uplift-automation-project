package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoicing {

    public Invoicing(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//li[@style='display: block;'])[12]")
    public WebElement invoicingPage;
}
