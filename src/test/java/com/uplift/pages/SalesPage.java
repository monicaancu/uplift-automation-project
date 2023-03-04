package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {

    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
