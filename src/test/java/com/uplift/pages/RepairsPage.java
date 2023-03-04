package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class RepairsPage {

    public RepairsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
