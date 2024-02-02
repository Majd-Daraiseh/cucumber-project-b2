package com.loop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SmartBearAllOrderPage {
    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement viewAllOrders;
    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]")
    public WebElement nameSection;
}
