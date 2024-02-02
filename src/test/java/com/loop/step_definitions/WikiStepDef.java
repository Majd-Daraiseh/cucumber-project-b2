package com.loop.step_definitions;
import com.loop.pages.WikiPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
public class WikiStepDef {
    WikiPage wikiPage = new WikiPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("Wiki.url"));}
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String name)
    {wikiPage.searchBox.sendKeys(name);}

    @Then("User clicks wiki search button")
    public void user_clicks_wiki_search_button()
    {wikiPage.searchButton.click();}
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String title) {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("expected does not match the actual",title, actualTitle);}
    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String header) {
        String actualHeader = wikiPage.header.getText();
        assertEquals("expected does not match the actual",header, actualHeader);}
    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeader) {
        String actualHeader = wikiPage.imageHeader.getText();
        assertEquals("expected does not match the actual",imageHeader, actualHeader);
        BrowserUtils.takeScreenshot();
    }
}
