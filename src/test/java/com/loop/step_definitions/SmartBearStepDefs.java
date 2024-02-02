package com.loop.step_definitions;

import com.loop.pages.SmartBearBasePage;
import com.loop.pages.SmartBearLoginPage;
import com.loop.pages.SmartBearOrderPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import com.loop.utilities.SmartBearConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class SmartBearStepDefs {

    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
    SmartBearBasePage smartBearBasePage = new SmartBearBasePage();
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("smart.bear"));
        smartBearLoginPage.smartBearUserName.sendKeys(SmartBearConstants.smartBearUserName);
        smartBearLoginPage.smartBearPassword.sendKeys(SmartBearConstants.smartBearPassword);
        smartBearLoginPage.smartBearLogin.click();
        smartBearBasePage.orderPageButton.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        smartBearOrderPage.productDropDown.click();
        Select select = new Select(smartBearOrderPage.productDropDown);
        select.selectByVisibleText(product);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        smartBearOrderPage.quantity.clear();
        smartBearOrderPage.quantity.sendKeys(""+ quantity);
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        smartBearOrderPage.customerName.sendKeys(name);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        smartBearOrderPage.street.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        smartBearOrderPage.city.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        smartBearOrderPage.state.sendKeys(state);
    }
    @When("user enters zip {string}")
    public void user_enters_zip(String zip) {
        smartBearOrderPage.zip.sendKeys(zip);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        smartBearOrderPage.masterCard.sendKeys(cardType);
        

    }
    @When("user enters card number {string}")
    public void user_enters_card_number(String cardNum) {
        smartBearOrderPage.cardNnm.sendKeys(cardNum);
    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String expDate) {
        smartBearOrderPage.expireDate.sendKeys(expDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        smartBearOrderPage.processBtn.click();
    }
    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String nameSection) {
        smartBearBasePage.viewAllOrders.click();
        BrowserUtils.takeScreenshot();
        assertEquals("Test Failed",smartBearBasePage.orderName.getText(),nameSection);
    }
}
