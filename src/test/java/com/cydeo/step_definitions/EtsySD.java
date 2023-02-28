package com.cydeo.step_definitions;

import com.cydeo.pages.Etsy;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsySD {
    Etsy etsy=new Etsy();
    @Then("Verify title is as expected: {string}")
    public void verifyTitleIsAsExpected(String str) {
        Assert.assertEquals(str, Driver.getDriver().getTitle());
    }

    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsy.searchBox.sendKeys("Wooden Spoon");
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        etsy.searchButton.click();

    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        //System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals("Wooden spoon - Etsy",Driver.getDriver().getTitle());
    }

    @When("Customer type {string} in the search box")
    public void customerTypeWoodenSpoonInTheSearchBox(String str) {
        etsy.searchBox.sendKeys(str+ Keys.ENTER);
    }


    @Then("Customer sees {string} is in the title")
    public void customerSeesWoodenSpoonIsInTheTitle(String str) {
        Assert.assertEquals(str,Driver.getDriver().getTitle());
    }
}
