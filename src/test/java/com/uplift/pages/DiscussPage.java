package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage {

    public DiscussPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
