package com.uplift.step_definitions;

import com.uplift.pages.LoginPage;
import com.uplift.pages.PointOfSalePage;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class US05_StepDefs {

    LoginPage loginPage = new LoginPage();
    PointOfSalePage posPage = new PointOfSalePage();

    @Given("POS Manager is logged in")
    public void pos_manager_is_logged_in() {
        loginPage.loginPOSManager();
    }
    @Given("POS Manager is on the Point of Sales page")
    public void pos_manager_is_on_the_point_of_sales_page() {
        posPage.pointOfSaleNavigationLink.click();

    }
    @Given("POS Manager clicks Orders link on the left side nav bar")
    public void pos_manager_clicks_orders_link_on_the_left_side_nav_bar() {
        posPage.ordersSideLink.click();
    }

    @Then("POS Manager should be able to select all orders by clicking the Order Ref checkbox")
    public void pos_manager_should_be_able_to_select_all_orders_by_clicking_the_order_ref_checkbox() {
        //selects all orders in the table
        posPage.ordersTableCheckbox.click();

        //save all the oder checkboxes in list
        List<WebElement> orderCheckboxes = new ArrayList<>(Arrays.asList(posPage.orderCheckboxes)) ;

        //loop through the list to check if they're selected
        boolean checkboxIsSelected = true;
        for(WebElement each: orderCheckboxes){
            if(!each.isSelected()){
                checkboxIsSelected = false;
                break;
            }
        }

        //assert if all checked
        Assert.assertTrue(checkboxIsSelected == true);

    }

    @When("POS Manager selects all orders on Point of Sales > Orders page")
    public void pos_manager_selects_all_orders_on_point_of_sales_orders_page() {
        posPage.pointOfSaleNavigationLink.click();
        posPage.ordersSideLink.click();
        posPage.ordersTableCheckbox.click();
    }
    @Then("POS Manager should see below options")
    public void pos_manager_should_see_below_options(io.cucumber.datatable.DataTable expectedDropdownOptions) {

        //click the Action dropdown to open
        posPage.actionsDropdownButton.click();

        //get the actual options as WebElement
        List<WebElement> actualActionDropdownOptions = new ArrayList<>(Arrays.asList(posPage.actionsDropdownOptions));

        //get the actual options as String
        List<String> actual_as_String = new ArrayList<>();
        for (WebElement each: actualActionDropdownOptions){
            actual_as_String.add(each.getText());
        }

        //verify Strings match
        Assert.assertEquals("expected vs actual mismatch", expectedDropdownOptions, actual_as_String);

    }
}
