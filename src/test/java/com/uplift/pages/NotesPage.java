package com.uplift.pages;

import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.ConfigurationReader;
import com.uplift.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage {

    public NotesPage(){
        PageFactory.initElements(Driver.getDriver(), this);

         }

    @FindBy(xpath="(//li[@style='display: block;'])[3]")
    public WebElement notesPage;



}
