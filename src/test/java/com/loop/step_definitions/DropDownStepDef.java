package com.loop.step_definitions;
import com.loop.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DropDownStepDef {


    WebDriver driver;
    Select selectDropDown;
    List<WebElement> dropDownOptions;
    @Given("User is on {string}")
    public void user_is_on(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }
    @When("User locates the dropdown.")
    public void usr_clicks_on_the_dropdown() {
        selectDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

    }
    @And("User gets all options")
    public void userGetsAllOptions() {
        dropDownOptions = selectDropDown.getOptions();
    }
    @Then("Dropdown is not empty")
    public void dropdown_is_not_empty() {

        assertTrue(!dropDownOptions.isEmpty());

    }

    @Then("validate that the dropdown has all the options")
    public void validateThatTheDropdownHasAllTheOptions(DataTable options) {

        List <String> actualOptionNAmes = new ArrayList<>();

        for (WebElement element: dropDownOptions ){

            actualOptionNAmes.add(element.getText());
        }
       List <String> expectedOptionName = options.asList();

        assertEquals(expectedOptionName, actualOptionNAmes);

    }
}
