package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {

    @Given("Go to: {string}")
    public void goTo(String str) {
        Driver.getDriver().get(str);
    }


    @When("Enter username: Test")
    public void enterUsernameTest() {
    }

    @And("Enter password: Tester")
    public void enterPasswordTester() {
    }

    @Then("Verify URL: should end with “orders”")
    public void verifyURLShouldEndWithOrders() {
    }


}
