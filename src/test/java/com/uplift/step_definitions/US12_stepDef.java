package com.uplift.step_definitions;

import com.uplift.pages.BasePage;
import com.uplift.pages.LoginPage;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_stepDef extends BasePage{

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get("https://qa.uplifterp.com/web/login");

    }

    LoginPage loginPage = new LoginPage();

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String userName, String password) {
        loginPage.login(userName, password);
    }


    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedAccountHolderName) {
        String actualAccountHolderName = accountHolderName.getText();
        Assert.assertEquals(expectedAccountHolderName.toLowerCase(), actualAccountHolderName.toLowerCase());
    }



}
