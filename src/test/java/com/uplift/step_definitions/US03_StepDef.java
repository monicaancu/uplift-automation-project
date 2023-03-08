package com.uplift.step_definitions;

import com.uplift.pages.LoginPage;
import com.uplift.utilities.ConfigurationReader;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US03_StepDef {

    LoginPage loginPage = new LoginPage();

    @Given("I am already on login page with giving URL.")
    public void i_am_already_on_login_page_with_giving_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));}


    @Given("I already logged in as a POS manager.")
    public void i_already_logged_in_as_a_pos_manager() { loginPage.loginPOSManager();}


    @Then("I am able to see all modules as a POS manager.")
    public void i_am_able_to_see_all_modules_as_a_pos_manager() {



    }


    @Then("I am able to access all  modules as a POS manager.")
    public void i_am_able_to_access_all_modules_as_a_pos_manager() {



    }





}
