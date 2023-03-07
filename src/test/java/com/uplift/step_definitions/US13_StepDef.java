package com.uplift.step_definitions;

import com.uplift.pages.BasePage;
import com.uplift.pages.DiscussPage;
import com.uplift.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US13_StepDef extends BasePage {

    DiscussPage discussPage = new DiscussPage();

    @Then("ExpenceManager login name should be visible")
    public void expence_manager_login_name_should_be_visible() {
        String actualLoginName = discussPage.loginName.getText().replaceAll("@.+$", "");;
        String expectedExpenceManager = ConfigurationReader.getProperty("expenses_manager_username").replaceAll("@.+$", "");
        Assert.assertEquals(expectedExpenceManager.toLowerCase(),actualLoginName.toLowerCase());
    }

    @Then("SalesManager login name should be visible")
    public void sales_manager_login_name_should_be_visible() {
        String actualLoginName = discussPage.loginName.getText().replaceAll("@.+$", "");
        String expectedSalesManager = ConfigurationReader.getProperty("sales_manager_username").replaceAll("@.+$", "");
        Assert.assertEquals(expectedSalesManager.toLowerCase(),actualLoginName.toLowerCase());
    }



}
