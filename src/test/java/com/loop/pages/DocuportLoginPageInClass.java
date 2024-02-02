package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocuportLoginPageInClass extends DocuportBasePageInClass{

        @FindBy(xpath = "//input[@id='input-14']")
        public WebElement usernameInput;

        @FindBy(xpath = "//input[@id='input-15']")
        public WebElement passwordInput;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement loginButton;

        @FindBy(xpath = "//button[@type='submit']//span")
        public WebElement continueButton;




        /**
         * logins to docuport
         * @param username
         * @param password
         * @author nsh
         */
        public void loginDocuport(String username, String password){
            BrowserUtils.waitForVisibility(usernameInput, DocuportConstants.small);
            usernameInput.clear();
            usernameInput.sendKeys(username);
            passwordInput.clear();
            passwordInput.sendKeys(password);
            loginButton.click();
            if (username.equals(DocuportConstants.USERNAME_CLIENT)){
                BrowserUtils.waitForVisibility(continueButton,DocuportConstants.extraLarge);
                BrowserUtils.waitForClickable(continueButton,DocuportConstants.extraLarge);
                BrowserUtils.clickWithJS(continueButton);
            }
        }


        public DocuportLoginPageInClass() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
    }

