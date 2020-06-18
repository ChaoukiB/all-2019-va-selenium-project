package com.cybertek.library.step_deinitions;

import com.cybertek.library.pages.UserPage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UsersTabeStepDefs {
    UserPage usersPage = new UserPage();

    @When("I search for {string}")
    public void i_search_for(String searchString) {
        BrowserUtils.waitForClickability(usersPage.search, 5);
        usersPage.search.sendKeys(searchString);
        BrowserUtils.wait(1);
    }

    @Then("table should contain rows with {string}")
    public void table_should_contain_rows_with(String expectedString) {

        int size = usersPage.allUserIds.size();
        for (int i = 0; i < size; i++) {
            String id = usersPage.allUserIds.get(i).getText().toLowerCase();
            String name = usersPage.allFullNames.get(i).getText().toLowerCase();
            String email = usersPage.allEmails.get(i).getText().toLowerCase();

            System.out.println("ROW: " + (i + 1));
            System.out.println(id + "\t" + name + "\t"+email);

            boolean found = id.contains(expectedString) ||
                    name.contains(expectedString) ||
                    email.contains(expectedString);
            assertTrue(found);
        }

    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedColumnsNames) {
        System.out.println(expectedColumnsNames);
        List<String> actualColumnsNames = BrowserUtils.getElementsText(usersPage.columnNames);
        assertEquals(expectedColumnsNames, actualColumnsNames);

    }

    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() throws InterruptedException {
       usersPage.getShowRecords().selectByVisibleText("500");
       // "argument[0].scrollIntoView(true)
        Thread.sleep(1000);
   List<String> list = BrowserUtils.getElementsText(usersPage.allUserIds);
        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        Assert.assertEquals(set.size(), list.size());
    }
}
