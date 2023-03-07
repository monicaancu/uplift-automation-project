package com.uplift.step_definitions;

import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.ConfigurationReader;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US09_StepDef {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("document.body.style.zoom = '90%'");

        BrowserUtils.sleep(2);

    }
    @Then("user should see nineteen modules at the top of the page")
    public void user_should_see_nineteen_modules_at_the_top_of_the_page(List<String> given_list_Modules) {

        List<String> actual_list_Modules = BrowserUtils.getElementsText(By.xpath(ConfigurationReader.getProperty("modules_locator_xpath")));

        Assert.assertEquals(given_list_Modules, actual_list_Modules);

    }

    @Then("user should see the users nickname at the right top of the page")
    public void user_should_see_the_users_nickname_at_the_right_top_of_the_page() {

        String eun = "SalesManager99";

        WebElement aun = Driver.getDriver().findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right oe_user_menu_placeholder']"));
        String saun = aun.getText();

        Assert.assertEquals(eun, saun);
    }
}
