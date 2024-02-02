package com.loop.step_definitions;


import com.loop.pages.LoginPageDocuport;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginStepDefs {
    LoginPageDocuport loginPage = new LoginPageDocuport();


    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        // this will read from the parameter you created in Jenkins Job
        // String envFromJenkins = System.getenv()
        String envFromJenkins = System.getenv("env");


        Driver.getDriver().get(ConfigurationReader.getProperties("env"));
        // Driver.getDriver().get(ConfigurationReader.getProperty(System.getenv("env")));
        // Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.takeScreenshot();
    }

    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(loginPage.usernameInput, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
    }

    @When("user enters password for client")
    public void user_enters_password_for_client() {
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstants.large);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();

    }
    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        BrowserUtils.waitForClickable(loginPage.continueButton, DocuportConstants.large);
        loginPage.continueButton.click();
    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        BrowserUtils.waitForVisibility(loginPage.recDoc, DocuportConstants.large);
        assertEquals(Driver.getDriver().getCurrentUrl(), DocuportConstants.HOME_PAGE_URL);

    }
    @Then("user clicks on Batch1 Group3 button")
    public void user_clicks_on_batch1_group3_button() {
        loginPage.b1g3Button.click();
    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        BrowserUtils.waitForClickable(loginPage.usernameInput, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);

    }

    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        BrowserUtils.waitForClickable(loginPage.passwordInput, DocuportConstants.large);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);

    }

    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {
        BrowserUtils.waitForVisibility(loginPage.recDoc, DocuportConstants.large);
        assertEquals(Driver.getDriver().getCurrentUrl(), DocuportConstants.HOME_PAGE_URL);

    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        BrowserUtils.waitForClickable(loginPage.usernameInput, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);
    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        BrowserUtils.waitForClickable(loginPage.passwordInput, DocuportConstants.large);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }
    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {
        BrowserUtils.waitForVisibility(loginPage.recDoc, DocuportConstants.large);
        assertEquals(Driver.getDriver().getCurrentUrl(), DocuportConstants.HOME_PAGE_URL);
    }

    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        BrowserUtils.waitForClickable(loginPage.usernameInput, DocuportConstants.large);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        BrowserUtils.waitForClickable(loginPage.passwordInput, DocuportConstants.large);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {
        BrowserUtils.waitForVisibility(loginPage.recDoc, DocuportConstants.large);
        assertEquals(Driver.getDriver().getCurrentUrl(), DocuportConstants.HOME_PAGE_URL);
    }

    @Then("user clicks on log out button")
    public void user_clicks_on_log_out_button() {
        BrowserUtils.waitForClickable(loginPage.logOutButton, DocuportConstants.large);
        loginPage.logOutButton.click();
    }
    @Then("user should see the home page")
    public void user_should_see_the_home_page() {
        assertEquals(Driver.getDriver().getCurrentUrl(), DocuportConstants.HOME_PAGE_URL);
    }

    @When("user enters credentials")
    public void user_enters_credentials(Map<String, String > credentials) {

//        for (Map.Entry <String, String> entry : credentials.entrySet()){
//            String Key = entry.getKey();
//            System.out.println("Key = " + Key);
//            String value = entry.getValue();
//            System.out.println("value = " + value);
//            System.out.println("===================");
//
//        }

        loginPage.loginDocuport(credentials.get("username"), credentials.get("password"));

    }
    }
