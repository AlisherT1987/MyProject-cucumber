package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearch;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class BingStepDefinitions {
    BingSearch bing=new BingSearch();
    @Given("go to {string}")
    public void goTo(String arg0) {
        Driver.getDriver().get("https://www.bing.com");
    }

    @And("search for  {string} in checkbox")
    public void searchForInCheckbox(String arg0) {
        bing.bing.sendKeys("orange");
        BrowserUtils.sleep(2);
        bing.bing.sendKeys(Keys.ENTER);
    }

    @Then("verify title is {string}")
    public void verifyTitleIs(String arg0) {
       // System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals("orange - Search",Driver.getDriver().getTitle());
    }
}
