package com.uplift.step_definitions;
import com.uplift.pages.LoginPage;
import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class US07_StepDef {


    LoginPage loginPage = new LoginPage();

    @Given("that the Events CRM Manager is logged in")
    public void that_the_events_crm_manager_is_logged_in() {
        loginPage.loginCRMManager();
        BrowserUtils.sleep(1);
    }


    @Then("they should be able to access the following {int} modules")
    public void they_should_be_able_to_see_the_following_modules(int numOfModules ) {

        List<WebElement> listOfModules = Driver.getDriver().findElements(By.xpath("//li[@style='display: block;']"));

        for (WebElement eachModule : listOfModules) {
            System.out.println("CRM Manager is able to access this module : " + eachModule.getText());
            eachModule.click();
            BrowserUtils.sleep(1);
        }

        int actualModules = listOfModules.size();
        Assert.assertEquals(numOfModules, actualModules);

    }

}



