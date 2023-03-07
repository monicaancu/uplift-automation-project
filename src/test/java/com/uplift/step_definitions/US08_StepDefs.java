package com.uplift.step_definitions;

import com.uplift.utilities.BrowserUtils;
import com.uplift.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US08_StepDefs {

    @Then("Expenses manager should able to see 12 modules")
    public void expenses_manager_should_able_to_see_modules() {

            List<WebElement> list = Driver.getDriver().findElements(By.xpath("//li[@style='display: block;']"));

            int expectedModules = 12;
            System.out.println("Total Module Amount = " + list.size());

            for (WebElement eachModule : list) {
                System.out.println("Module = " + eachModule.getText());
            }


            Assert.assertEquals(expectedModules,list.size());


        }

    }


