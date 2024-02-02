package com.loop.step_definitions;

import com.loop.pages.ClientPageInClass;
import com.loop.pages.DocuportBasePage;
import com.loop.pages.DocuportBasePageInClass;
import com.loop.pages.DocuportLoginPageInClass;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.DocuportConstants;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.SoftAssertions;

public class ClientInClassStepDefs {

    ClientPageInClass clientPageInClass = new ClientPageInClass();

    DocuportLoginPageInClass docuportLoginPageInClass = new DocuportLoginPageInClass();

    private Logger LOG = LogManager.getLogger();

    private SoftAssertions softAssertions = new SoftAssertions();

    @Then("user validates {string} text is displayed")
    public void user_validates_text_is_displayed(String text) {
        //assertTrue(loginPage.getElement(text).isDisplayed());
        String actual = docuportLoginPageInClass.getElementText(text);
        // assertEquals("Actual text: " + actual + " does NOT match expected: " + text, actual, text);
        softAssertions.assertThat(actual).isEqualTo("Nadir");

    }
    @Then("user clicks {string} button")
    public void user_clicks_button(String button) {
        BrowserUtils.waitForVisibility(clientPageInClass.continueButton, DocuportConstants.large);
        DocuportBasePageInClass.clickButton(button);
    }
    @Then("user validates all assertions")
    public void user_validates_all_soft_assertions() {
        softAssertions.assertAll();
    }



}


