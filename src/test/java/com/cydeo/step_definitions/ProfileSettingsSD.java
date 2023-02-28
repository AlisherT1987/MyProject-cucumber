package com.cydeo.step_definitions;

import com.cydeo.pages.Seamlessly;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProfileSettingsSD {
    Seamlessly seamlessly=new Seamlessly();
    @And("the user clicks settings label")
    public void theUserClicksSettingsLabel() {
        seamlessly.settingsLabel.click();
    }
    @Then("the user should see following labels")
    public void the_user_should_see_following_labels(List<String>labels) {
       List<String> list=new ArrayList<>();
        for (WebElement eachLabel : seamlessly.followingLabels) {
            list.add(eachLabel.getText());
        }
        boolean match=false;
        for (String each : labels) {
            if(list.contains(each)){
                match=true;
            }
        }
        Assert.assertTrue(match);
    }

    @And("the user enters the name {string}")
    public void theUserEntersTheName(String str) {
        BrowserUtils.sleep(1);
        seamlessly.name.clear();
        BrowserUtils.sleep(1);
        seamlessly.name.sendKeys(str+ Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    @Then("the user should be able to see the {string}")
    public void theUserShouldBeAbleToSeeThe(String str) {
        Assert.assertEquals(str,seamlessly.verifyName.getText());
    }

    @And("the user clicks the phone icon-triangle")
    public void theUserClicksThePhoneIconTriangle() {
        BrowserUtils.sleep(2);
        seamlessly.iconTriangle.click();
    }

    @And("the user clicks the private label")
    public void theUserClicksThePrivateLabel() {
        BrowserUtils.sleep(2);
        seamlessly.privateLabel.click();
        BrowserUtils.sleep(4);
    }

    @Then("the user should see the private is selected")
    public void theUserShouldSeeThePrivateIsSelected() {
       Assert.assertTrue(seamlessly.iconPrivate.isDisplayed());
    }

    @Then("the user should see the localtime in page")
    public void theUserShouldSeeTheLocaltimeInPage() {
        Assert.assertTrue(seamlessly.localTime.isDisplayed());
    }

    @When("user can click task icon")
    public void userCanClickTaskIcon() {
        seamlessly.taskIcon.click();
    }

    @And("Click Add to list")
    public void clickAddToList() {
        seamlessly.addToList.click();
    }

    @And("Enter {string} task and click save")
    public void enterTaskAndClickSave(String str) {
        seamlessly.addCheckbox.sendKeys(str+Keys.ENTER);
    }

    @Then("User cans see left drop down menu {string} appear in the School list")
    public void userCansSeeLeftDropDownMenuAppearInTheList(String str) {
        Assert.assertEquals(str,seamlessly.schoolName.getText());
    }

    @And("Enter your task {string}")
    public void enterYourTask(String str) {
        seamlessly.taskHomeworks.sendKeys(str+Keys.ENTER);
    }

    @Then("User can see created task {string} in the School list")
    public void userCanSeeCreatedTaskInTheList(String str) {
      Assert.assertEquals(str,seamlessly.homeworkName.getText());
    }
}
