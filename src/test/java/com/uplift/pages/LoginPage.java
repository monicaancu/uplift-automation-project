package com.uplift.pages;


import com.uplift.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@id='login']")
    public WebElement userName;

    @FindBy(xpath="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;


    public void login(String userNameStr, String passwordStr) {
        this.userName.sendKeys(userNameStr);
        this.password.sendKeys(passwordStr);
        loginButton.click();
//        verification that we logged
   }
    public void loginPOSManager(){
        this.userName.sendKeys("posmanager10@info.com");
        this.password.sendKeys("posmanager");
        loginButton.click();
    }

    public void loginCRMManager(){
        this.userName.sendKeys("eventscrmmanager10@info.com");
        this.password.sendKeys("eventscrmmanager");
        loginButton.click();
    }

    public void loginSalesManager(){
        this.userName.sendKeys("salesmanager99@info.com");
        this.password.sendKeys("salesmanager");
        loginButton.click();
    }

    public void loginInventoryManager(){
        this.userName.sendKeys("imm28@info.com");
        this.password.sendKeys("inventorymanager");
        loginButton.click();
    }

    public void loginExpensesManager(){
        this.userName.sendKeys("expensesmanager65@info.com");
        this.password.sendKeys("expensesmanager");
        loginButton.click();
    }



}
