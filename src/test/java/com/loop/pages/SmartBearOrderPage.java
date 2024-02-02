package com.loop.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SmartBearOrderPage extends SmartBearBasePage{
    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement productDropDown;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;
    @FindBy (name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerName;
    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement street;
    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;
    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;
    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zip;
    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_1']")
    public WebElement masterCard;
    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNnm;
    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expireDate;
    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtUnitPrice']")
    public WebElement pricePerUnit;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtDiscount']")
    public WebElement discount;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtTotal']")
    public WebElement total;
    @FindBy (xpath = "//input[@value='Calculate']")
    public WebElement calculate;








}
