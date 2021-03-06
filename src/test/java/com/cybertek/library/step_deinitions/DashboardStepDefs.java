package com.cybertek.library.step_deinitions;

import com.cybertek.library.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class DashboardStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {
        String actualName = dashboardPage.accountHolderName.getText();

        assertEquals("Account holder name did not match",
                expectedName, actualName);
    }

}
