package com.cydeo.step_definitions;

import com.cydeo.pages.Seamlessly;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.codec.compression.Brotli;
import org.junit.Assert;

public class LogOutStepDefinitions {
    Seamlessly seamlessly=new Seamlessly();

    @When("the user clicks the logout label")
    public void theUserClicksTheLogoutLabel() {
        seamlessly.logOutButton.click();
    }

    @Then("the user should see the url {string}")
    public void theUserShouldSeeTheUrl(String arg0) {
        Assert.assertEquals("http://qa.seamlessly.net/index.php/login?clear=1",Driver.getDriver().getCurrentUrl());
    }

    @When("the user clicks step back button")
    public void theUserClicksStepBackButton() {
        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().back();
    }

    @Then("user should see the url {string}")
    public void userShouldSeeTheUrl(String str) {
        Assert.assertEquals(str,Driver.getDriver().getCurrentUrl());
    }
}
