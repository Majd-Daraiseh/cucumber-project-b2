package com.loop.pages;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SmartBearBasePage {
    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderPageButton;
    @FindBy(xpath = "//a[@href='Default.aspx']")
    public WebElement viewAllOrders;
    @FindBy (xpath = "//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]")
    public WebElement orderName;
    public SmartBearBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}


