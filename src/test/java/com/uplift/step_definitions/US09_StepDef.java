package com.uplift.step_definitions;

import com.uplift.pages.*;
import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.ConfigurationReader;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US09_StepDef extends BasePage {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {

        BrowserUtils.executeJScommand("document.body.style.zoom = '0.9'");
        BrowserUtils.sleep(2);

    }

    @Then("user should see nineteen modules at the top of the page")
    public void user_should_see_nineteen_modules_at_the_top_of_the_page(List<String> given_list_Modules) {

        List<String> actual_list_Modules = BrowserUtils.getElementsText(By.xpath(ConfigurationReader.getProperty("modules_locator_xpath")));

        Assert.assertEquals(given_list_Modules, actual_list_Modules);

        BrowserUtils.executeJScommand("document.body.style.zoom = '1'");
        BrowserUtils.sleep(2);

    }


    @Then("user should see the users nickname at the right top of the page")
    public void user_should_see_the_users_nickname_at_the_right_top_of_the_page() {

        String given_nickname = BrowserUtils.nickName(ConfigurationReader.getProperty("sales_manager_username"));

        String actual_nickname_in_sting = accountHolderName.getText();

        Assert.assertEquals(given_nickname, actual_nickname_in_sting);


    }

    CalendarPage calendarPage = new CalendarPage();

    NotesPage notesPage = new NotesPage();

    ContactsPage contactsPage = new ContactsPage();

    CRM_Page crmPage = new CRM_Page();

    SalesPage salesPage = new SalesPage();

    WebsitePage websitePage = new WebsitePage();

    PointOfSalePage pointOfSalePage = new PointOfSalePage();

    Purchases purchasesPage = new Purchases();

    Inventory inventoryPage = new Inventory();

    Repairs repairsPage = new Repairs();

    Invoicing invoicingPage = new Invoicing();

    EmailMarketing emailMarketingPage = new EmailMarketing();

    Events eventsPage = new Events();

    Employees employeesPage = new Employees();

    Leaves leavesPage = new Leaves();

    Expenses expensesPage = new Expenses();

    Maintenance maintenancePage = new Maintenance();

    Dashboards dashboardsPage = new Dashboards();

    DiscussPage discussPage = new DiscussPage();


    @Then("user clicks on each modules options and verifies url contains part of the URL")
    public void user_clicks_on_each_modules_options_and_verifies_url_contains_part_of_the_url() {

        calendarPage.calendarPage.click();
        BrowserUtils.waitForTitleContains("Meetings");
        BrowserUtils.verifyURLContains("calendar");

        notesPage.notesPage.click();
        BrowserUtils.waitForTitleContains("Notes");
        BrowserUtils.verifyURLContains("note");

        contactsPage.contactsPage.click();
        BrowserUtils.waitForTitleContains("Contacts");
        BrowserUtils.verifyTitleContains("Contacts");

        crmPage.crmPage.click();
        BrowserUtils.waitForTitleContains("Pipeline");
        BrowserUtils.verifyURLContains("crm");


        salesPage.salesPage.click();
        BrowserUtils.waitForTitleContains("Quotations");
        BrowserUtils.verifyURLContains("sale");

        websitePage.websitePage.click();
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.verifyTitleContains("Dashboard");

        pointOfSalePage.pointOfSalePage.click();
        BrowserUtils.waitForTitleContains("Point of Sale");
        BrowserUtils.verifyTitleContains("Point of Sale");

        purchasesPage.purchasesPage.click();
        BrowserUtils.waitForTitleContains("Requests for Quotation");
        BrowserUtils.verifyURLContains("purchase");

        inventoryPage.inventoryPage.click();
        BrowserUtils.waitForTitleContains("Inventory");
        BrowserUtils.verifyURLContains("stock.picking");

        repairsPage.repairsPage.click();
        BrowserUtils.waitForTitleContains("Repair Orders");
        BrowserUtils.verifyURLContains("mrp.repair");

        invoicingPage.invoicingPage.click();
        BrowserUtils.waitForTitleContains("Customer Invoices");
        BrowserUtils.verifyURLContains("account.invoice");

        emailMarketingPage.emailMarketingPage.click();
        BrowserUtils.waitForTitleContains("Mass Mailings");
        BrowserUtils.verifyURLContains("mail.mass_mailing");

        eventsPage.eventsPage.click();
        BrowserUtils.waitForTitleContains("Events");
        BrowserUtils.verifyURLContains("event.event");

        employeesPage.employeesPage.click();
        BrowserUtils.waitForTitleContains("Employees");
        BrowserUtils.verifyURLContains("employee");

        leavesPage.leavesPage.click();
        BrowserUtils.waitForTitleContains("Leaves Summary");
        BrowserUtils.verifyURLContains("hr.holidays");

        expensesPage.expensesPage.click();
        BrowserUtils.waitForTitleContains("My Expenses to Submit");
        BrowserUtils.verifyURLContains("hr.expense");

        maintenancePage.maintenancePage.click();
        BrowserUtils.waitForTitleContains("Maintenance Teams");
        BrowserUtils.verifyURLContains("maintenance.team");

        discussPage.discussPage.click();
        BrowserUtils.waitForTitleContains("#Inbox");
        BrowserUtils.verifyURLContains("#menu_id");

        BrowserUtils.executeJScommand("document.body.style.zoom = '0.9'");
        BrowserUtils.sleep(2);

        dashboardsPage.dashboardsPage.click();
        BrowserUtils.waitForTitleContains("My Dashboard");
        BrowserUtils.verifyURLContains("board.board");






    }


}
