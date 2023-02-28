package com.cydeo.step_definitions;

import com.cydeo.pages.Flipkart;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSD {
    Flipkart flipkart=new Flipkart();
    @When("user find Wire Headphones and click it")
    public void user_find_wire_headphones_and_click_it() {
        BrowserUtils.sleep(2);
        flipkart.loginButton.click();
        Actions action=new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        action.moveToElement(flipkart.electronics).clickAndHold().perform();
        BrowserUtils.sleep(1);
        System.out.println(flipkart.audio.isDisplayed());
        System.out.println(flipkart.audio.getText());
        action.moveToElement(flipkart.audio).click().perform();
        BrowserUtils.sleep(10);

    }
    @Then("Verify user on Wire Headphones page")
    public void verify_user_on_wire_headphones_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Headphones"));
    }

    @When("click on the search box")
    public void clickOnTheSearchBox() {
        BrowserUtils.sleep(2);
        flipkart.loginButton.click();
        BrowserUtils.sleep(2);
flipkart.searchBox.click();
BrowserUtils.sleep(2);
    }

    @And("choose t-shirts on search list")
    public void chooseTShirtsOnSearchList() {
        System.out.println(flipkart.tShirts.isDisplayed());
        flipkart.tShirts.click();
    }

    @Then("Verify user on {string} page")
    public void verifyUserOnPage(String str) {
        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
        System.out.println(Driver.getDriver().getTitle());
    }
}
