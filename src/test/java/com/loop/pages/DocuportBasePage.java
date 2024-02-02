package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DocuportBasePage {
    @FindBy(xpath = "//div[@role='listbox']/a/div/following-sibling::div/div/span")
    List<WebElement> navigatorItems;
    @FindBy(xpath = "//span[@class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']")
    public WebElement b1g3Button;
    @FindBy(xpath = "//span[@class='body-2' and contains (text(), 'Log out')]")
    public WebElement logOutButton;
    public List<String> listOfItems(){
        BrowserUtils.waitForVisibility(b1g3Button, DocuportConstants.large);
        List<WebElement> sideList = new ArrayList<>();
        String xPath = "//div[@role='listbox']/a/div/following-sibling::div/div/span";
        sideList = Driver.getDriver().findElements(By.xpath(xPath));
        List<String> StringSideList = new ArrayList<>();
        for (WebElement each: sideList){
            StringSideList.add(each.getText());
        }return StringSideList;
    }
    public DocuportBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

