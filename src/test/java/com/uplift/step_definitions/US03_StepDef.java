package com.uplift.step_definitions;

import com.uplift.pages.BasePage;
import com.uplift.pages.LoginPage;
import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.ConfigurationReader;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.uplift.utilities.BrowserUtils.getElementsText;

public class US03_StepDef extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("I am already on login page with giving URL.")
    public void i_am_already_on_login_page_with_giving_url() {Driver.getDriver().get(ConfigurationReader.getProperty("url"));}


    @And("I already logged in as a POS manager.")
    public void i_already_logged_in_as_a_pos_manager() {
        loginPage.loginPOSManager();
        //loginPage.loginSalesManager();
        //loginPage.loginInventoryManager();
    }


    @Then("I am able to see all modules as a POS manager.")
    public void i_am_able_to_see_all_modules_as_a_pos_manager() {

        System.out.println("getElementsText(By.xpath(\"//li[@style='display: block;']\")) = " + getElementsText(By.xpath("//li[@style='display: block;']")));
        //System.out.println("getElementsText(By.xpath(\"//li[@style='display: block;']\")).size() = " + getElementsText(By.xpath("//li[@style='display: block;']")).size());



    }


    @Then("I am able to access all  modules as a POS manager.")
    public void i_am_able_to_access_all_modules_as_a_pos_manager() throws InterruptedException {

        List<WebElement> actualListOfModules = Driver.getDriver().findElements(By.xpath("//li[@style='display: block;']"));

        int expectedListOfModules = 22;


        for (WebElement each : actualListOfModules) {

            each.click();
            String textOfModule = each.getText();

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8000));
            wait.until(ExpectedConditions.elementToBeClickable(each));
            //waitForPresenceOfElement(By.xpath("//li[@style='display: block;']"), 10);
            // Thread.sleep(4000);

            System.out.println("All Modules are clickable and accessible. Module name is : " + textOfModule);
        }

        //String partOfModules = "Leaves";

        Assert.assertEquals("MODULES SIZE ARE NOT EQUAL", expectedListOfModules, actualListOfModules.size());

}}
