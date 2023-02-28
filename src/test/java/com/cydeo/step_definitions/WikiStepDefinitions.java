package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefinitions {
    Wikipedia wiki=new Wikipedia();
    @Given("User is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types Steve Jobs in the wiki search box")
    public void userTypesSteveJobsInTheWikiSearchBox() {
        wiki.searchBox.sendKeys("Steve Jobs");
    }

    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        wiki.searchButton.click();
    }

    @Then("User sees Steve Jobs is in the wiki title")
    public void userSeesSteveJobsIsInTheWikiTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Steve Jobs"));


    }

    @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {
        Assert.assertEquals("Steve Jobs",wiki.header.getText());
    }

    @Then("User sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        Assert.assertTrue(wiki.imageHeader.isDisplayed());
    }
}
