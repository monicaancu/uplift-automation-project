package com.uplift.step_definitions;

import com.uplift.pages.DocumentationPage;
import com.uplift.pages.PointOfSalePage;
import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class US06_StepDefs {

    @Given("I click my username and access the menu")
    public void i_click_my_username_and_access_the_menu() {
        // Write code here that turns the phrase above into concrete actions
       WebElement userName = Driver.getDriver().findElement(By.xpath("//span[@class='oe_topbar_name']"));

       userName.click();


    }
    @Then("It will display the Odoo Documentation page")
    public void it_will_display_the_odoo_documentation_page() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.odoo.com/documentation/16.0/";

        Assert.assertEquals(expectedURL, actualURL);
    }


    @Given("I am on documentation page")
    public void i_am_on_documentation_page() {

        Driver.getDriver().get("https://www.odoo.com/documentation/16.0/");

    }

    @Then("I should see four main topics listed")
    public void i_should_see_four_main_topics(io.cucumber.datatable.DataTable documentNames){
        DocumentationPage docPage = new DocumentationPage();

        List<WebElement> topics = new ArrayList<>();
        topics.add(docPage.userDocs);
        topics.add(docPage.installAndMaintain);
        topics.add(docPage.developer);
        topics.add(docPage.contributor);
        List<String> topicsAsString = new ArrayList<>();

        for (WebElement each : topics) {
            topicsAsString.add(each.getText());


        }

        Assert.assertEquals(documentNames, topicsAsString);

    }


    @And("I click the documentation option")
    public void iClickTheDocumentationOption() {

        WebElement documentationLink = Driver.getDriver().findElement(By.linkText("Documentation"));

        documentationLink.click();

        BrowserUtils.sleep(2);

        String parent = Driver.getDriver().getWindowHandle();
        List<String> s = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(s.get(1));

    }
}
