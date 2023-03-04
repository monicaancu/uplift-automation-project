package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage {

    public DocumentationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
