package com.loop.step_definitions;

import com.loop.pages.DocuportBasePage;
import com.loop.pages.DocuportLoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
public class DocportNavigatorStepDef {
    DocuportBasePage docuportBasePage = new DocuportBasePage();
    DocuportLoginPage docuportLoginPage = new DocuportLoginPage();
    @Then("user is on the home page of Docuport {string}")
    public void user_is_on_the_home_page_of_docuport(String role) {
        String username = "";
        switch(role){
            case "client":
                username = DocuportConstants.USERNAME_CLIENT;
                break;
            case "employee":
                username = DocuportConstants.USERNAME_EMPLOYEE;
                break;
            case "supervisor":
                username = DocuportConstants.USERNAME_SUPERVISOR;
                break;
            case "advisor":
                username = DocuportConstants.USERNAME_ADVISOR;
                break;
            default:
                System.out.println("Not a user!");
        }
        docuportLoginPage.docuportLogin(username, DocuportConstants.PASSWORD);
    }
    @Then("validate left navigator items of Docuport for all {string}")
    public void validate_left_navigator_items_of_docuport_for_all(String role, Map<String, List<String>> navigatorItems) {
        List<String> expectedNavItems = navigatorItems.get(role).stream().filter(item -> item != null).toList();
        List <String> actualNavItems = docuportBasePage.listOfItems();
        BrowserUtils.takeScreenshot();
        assertEquals(expectedNavItems, actualNavItems);
    }
}
