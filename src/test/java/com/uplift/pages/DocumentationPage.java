package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage {

    public DocumentationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(linkText = "User Docs")
    public WebElement userDocs;

    @FindBy(linkText = "Install and Maintain")
    public WebElement installAndMaintain;

    @FindBy(linkText = "Developer")
    public WebElement developer;

    @FindBy(linkText = "Contributing")
    public WebElement contributor;
}



