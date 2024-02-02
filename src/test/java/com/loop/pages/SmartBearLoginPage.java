package com.loop.pages;

import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import com.loop.utilities.SmartBearConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SmartBearLoginPage extends SmartBearBasePage{

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement smartBearUserName;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement smartBearPassword;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement smartBearLogin;

}




