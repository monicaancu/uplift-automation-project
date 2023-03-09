package com.uplift.pages;

import com.uplift.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSalePage {

    public PointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement pointOfSaleNavigationLink;

    @FindBy(linkText = "Orders")
    public WebElement ordersSideLink;

    @FindBy(xpath = "//thead//input[@type='checkbox']")
    public WebElement ordersTableCheckbox;

    //this is what you click to open the dropdown
    @FindBy(xpath = "//button[normalize-space()='Action']")
    public WebElement actionsDropdownButton;

    //this dropdown created with ul/li
    @FindBy(xpath = "//div[@class='btn-group o_dropdown open']//ul[@role='menu']")
    public WebElement actionsDropdownOptions;

    @FindBy(xpath = "//tbody//div/input")
    public WebElement orderCheckboxes;

    @FindBy(xpath="(//li[@style='display: block;'])[8]")
    public WebElement pointOfSalePage;
}
