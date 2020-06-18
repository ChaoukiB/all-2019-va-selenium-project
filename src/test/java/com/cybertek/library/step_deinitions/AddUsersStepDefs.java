package com.cybertek.library.step_deinitions;

import com.cybertek.library.pages.UserPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AddUsersStepDefs {
    UserPage userPage = new UserPage();

    @When("I click on Add Users")
    public void i_click_on_Add_Users() {
        userPage.addUsers.click();

    }

    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(Map<String, String> fields) {
        for (String key : fields.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + fields.get(key));
            System.out.println();
        }

        String expectedFullname = fields.get("fullname");
        String actualFullName = userPage.fullName.getAttribute("placeholder");
        assertEquals("Full Name placeholder value did not match",
                expectedFullname, actualFullName);

        String expectedEmail = fields.get("email");
        String actualEmail = userPage.email.getAttribute("placeholder");
        assertEquals("Email placeholder value did not match",
                expectedEmail, actualEmail);

        String expectedPassword = fields.get("password");
        String actualPassword = userPage.password.getAttribute("placeholder");
        assertEquals("Password placeholder value did not match",
                expectedPassword, actualPassword);

        String actualAddress = userPage.address.getAttribute("placeholder");
        assertEquals("Address placeholder must be empty",
                "", actualAddress);


        String myString;
        String yourString="";
    }

}
