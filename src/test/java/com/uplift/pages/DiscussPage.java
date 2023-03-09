package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage {

    public DiscussPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement loginName;

    @FindBy(xpath="(//li[@style='display: block;'])[1]")
    public WebElement discussPage;
}

