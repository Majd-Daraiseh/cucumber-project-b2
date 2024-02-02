package com.loop.pages;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javax.xml.xpath.XPath;
public class WikiPage {
    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;
    @FindBy(xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement searchButton;
    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement header;
    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;
    public WikiPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}


