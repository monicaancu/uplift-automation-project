package com.uplift.step_definitions;

import com.uplift.pages.LoginPage;
import io.cucumber.java.en.Given;

public class logins_StepDefinitions extends LoginPage {

    @Given("POSManager enters login credentials")
    public void POSManager_enters_login_credentials() {
        loginPOSManager();
    }

    @Given("SalesManager enters login credentials")
    public void salesManagerEntersLoginCredentials() {
        loginSalesManager();
    }

    @Given("EventsCRMManager enters login credentials")
    public void eventscrmmanagerEntersLoginCredentials() {
        loginCRMManager();
    }

    @Given("InventoryManager enters login credentials")
    public void inventorymanagerEntersLoginCredentials() {
        loginInventoryManager();
    }

    @Given("ExpensesManager enters login credentials")
    public void expensesmanagerEntersLoginCredentials() {
        loginExpensesManager();
    }
}
