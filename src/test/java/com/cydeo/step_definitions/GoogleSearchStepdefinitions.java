package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearch;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchStepdefinitions {
    GoogleSearch google=new GoogleSearch();
    @Given("the user go to {string}")
    public void theUserGoTo(String arg0) {
        Driver.getDriver().get(ConfigurationReader.getProperty("googleEnv"));
    }

    @And("the user search for  {string} in checkbox")
    public void theUserSearchForInCheckbox(String arg0) {

       google.google.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("verify title is a expected {string}")
    public void verifyTitleIsAExpected(String arg0) {
        Assert.assertEquals("apple - Google Search",Driver.getDriver().getTitle());

    }
}
