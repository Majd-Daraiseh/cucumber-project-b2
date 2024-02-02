package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ClientPageInClass extends DocuportBasePageInClass{
    @FindBy(xpath = "//h3[.='Choose account']")
    public WebElement chooseAccountText;
    public ClientPageInClass(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
