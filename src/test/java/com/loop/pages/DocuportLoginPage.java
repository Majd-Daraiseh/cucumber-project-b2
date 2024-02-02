package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.DocuportConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DocuportLoginPage extends DocuportBasePage {


    @FindBy(xpath = "*//label[.='Username or email']//following-sibling::input")
    public WebElement usernameInput;

    @FindBy(xpath = "*//label[.='Password']//following-sibling::input")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    public WebElement continueButton;

    public void docuportLogin(String username, String password) {
        BrowserUtils.waitForVisibility(usernameInput, DocuportConstants.small);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginButton.click();
        if (username.contains("client")){
            BrowserUtils.waitForVisibility(continueButton, DocuportConstants.small).isDisplayed();
           continueButton.click();
        }
    }
}

