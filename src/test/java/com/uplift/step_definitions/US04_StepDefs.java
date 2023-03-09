package com.uplift.step_definitions;

import com.uplift.pages.LoginPage;
import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

public class US04_StepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("inventory manager is logged in")
    public void inventory_manager_is_logged_in() {
        loginPage.loginInventoryManager();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("document.body.style.zoom = '80%'"); //Sergii

        BrowserUtils.sleep(2);
    }

    @Then("inventory manager should see the following modules at the top of the main page")
    public void inventory_manager_should_see_the_following_modules_at_the_top_of_the_main_page(List<String> expectedModulesListText) {
        List<String> actualModulesListText = BrowserUtils.getElementsText(By.xpath("//li[@style='display: block;']"));

        Assert.assertEquals(expectedModulesListText, actualModulesListText);
        // Timesheets Module appears in InventoryManager10 actual list //
    }


    @Then("inventory manager should access the main modules")
    public void inventory_manager_should_access_the_main_modules() {


    }

}
