package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDocuport extends DocuportBasePage {

    @FindBy(xpath = "//label[.='Username or email']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    public WebElement continueButton;

    @FindBy(xpath = "//span[@class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']")
    public WebElement b1g3Button;

    @FindBy(xpath = "//span[@class='body-2' and contains (text(), 'Log out')]")
    public WebElement logOutButton;

    @FindBy(xpath = "(//div[@class='doc-card--text'])[1]")
    public WebElement recDoc;

    /**
     * logins to docuport
     * @param username
     * @param password
     * @author Majd
     */
    public void loginDocuport(String username, String password){
        BrowserUtils.waitForVisibility(usernameInput, DocuportConstants.small);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginButton.click();
        if (BrowserUtils.waitForVisibility(continueButton, DocuportConstants.small).isDisplayed()){
            continueButton.click();
        }
    }

    public LoginPageDocuport() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}