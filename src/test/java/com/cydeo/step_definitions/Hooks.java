package com.cydeo.step_definitions;

import com.cydeo.pages.Library;
import com.cydeo.pages.Seamlessly;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    Library library=new Library();
    Seamlessly seamlessly=new Seamlessly();

    //import the @Before coming from io.cucumber.java
   @Before(value = "@librarian")
   public void login_scenario_before_librarian() throws InterruptedException {
       Driver.getDriver().get(ConfigurationReader.getProperty("env"));
       BrowserUtils.sleep(1);
       library.emailAddress.sendKeys(ConfigurationReader.getProperty("username1"));
       BrowserUtils.sleep(1);
       library.password.sendKeys(ConfigurationReader.getProperty("password"));
       BrowserUtils.sleep(1);
       library.signInButton.click();
       BrowserUtils.sleep(1);

   }
    @Before(value = "@student")
    public void login_scenario_before_student() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(1);
        library.emailAddress.sendKeys(ConfigurationReader.getProperty("usernameStudent"));
        BrowserUtils.sleep(1);
        library.password.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(1);
        library.signInButton.click();
        BrowserUtils.sleep(1);

    }
    @Before(value = "@SEAMLES")
    public void login_scenario_before_seamless() throws InterruptedException {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            BrowserUtils.sleep(1);
            seamlessly.username.sendKeys(ConfigurationReader.getProperty("usernameS"));
            BrowserUtils.sleep(1);
            seamlessly.password.sendKeys(ConfigurationReader.getProperty("passwordS"));
            BrowserUtils.sleep(1);
            seamlessly.logInButton.click();
            BrowserUtils.sleep(2);
            seamlessly.avatarIcon.click();
        }
    @Before(value = "@etsy")
    public void login_page_scenario_before_etsy() throws InterruptedException {
       Driver.getDriver().get(ConfigurationReader.getProperty("etsyUrl"));
    }
    @Before(value = "@demoqa")
    public void login_page_scenario_before_demoqa() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("demoqaUrl"));
    }




    /*
    @After will be executed automatically after EVERY scenario in the project.
     */
    @After
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        Driver.closeDriver();

    }

}
