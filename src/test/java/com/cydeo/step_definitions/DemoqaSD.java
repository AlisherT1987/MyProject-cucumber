package com.cydeo.step_definitions;

import com.cydeo.pages.Demoqa;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class DemoqaSD {
    Demoqa demo=new Demoqa();
    Actions action=new Actions(Driver.getDriver());
    @Given("Navigate to {word} page")
    public void navigateToPage(String str) {

        demo.elements.click();
        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().to(Driver.getDriver().getCurrentUrl().replace("elements",str));
        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(str));
    }

    @When("Double click on button")
    public void doubleClickOnButton() {
       action.moveToElement(demo.doubleClickButtons).doubleClick().perform();

    }

    @Then("Verify textA :{string} should be visible")
    public void verifyTextYouHaveDoneADoubleClickShouldBeVisible(String str) {
    Assert.assertTrue(demo.message.isDisplayed());
    Assert.assertEquals(str,demo.message.getText());
    }

    @And("Right-click on button")
    public void rightClickOnButton() {
        action.contextClick(demo.rightClickButtons).perform();


    }
    @Then("Verify textB :{string} should be visible")
    public void verifyTextYouHaveDoneARightClickShouldBeVisible(String str) {
      //  Assert.assertTrue(demo.message2.isDisplayed());
       // Assert.assertEquals(str,demo.message2.getText());
    }

    @And("Click Me button")
    public void clickMeButton() {
        System.out.println(demo.ClickButton.getText());
        Assert.assertTrue(demo.ClickButton.isEnabled());

action.scrollByAmount(0,100).perform();
   action.moveToElement(demo.ClickButton).click().perform();

    }
    @Then("Verify textC :{string} should be visible")
    public void verifyTextYouHaveDoneADynamicClickShouldBeVisible(String str) {
        Assert.assertTrue(demo.message3.isDisplayed());
        Assert.assertEquals(str,demo.message3.getText());
    }
    @Given("Get to {word} page")
    public void getToLinksPage(String str) {

        demo.elements.click();
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().to(Driver.getDriver().getCurrentUrl().replace("elements",str));
       // BrowserUtils.sleep(2);
       // Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(str));

    }

    @When("the user clicks to {string}")
    public void theUserClicksTo(String link) {
       // Driver.getDriver().findElement(By.xpath("//a[.='"+link+"']")).click();
        action.scrollByAmount(0,150).perform();
        BrowserUtils.sleep(1);
        action.moveToElement(Driver.getDriver().findElement(By.xpath("//a[.='"+link+"']"))).click().perform();
    }

    @Then("the message contains {string}{string}")
    public void theMessageContains(String statusCode, String statusText ) {
        BrowserUtils.sleep(1);
        Assert.assertTrue(demo.linkMessage.getText().contains(statusCode));
        Assert.assertTrue(demo.linkMessage.getText().contains(statusText));
    }


}
