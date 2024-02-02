package com.loop.Practice;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClassPractice2 {


    /*
    User is on {string}
    User locates the dropdown.
    User gets all options
    Dropdown is not empty
     */

    static WebDriver driver;
    static Select selectDropDown;
    static List<WebElement> dropDownOptions;


    public static void main(String[] args) {


        driver = new ChromeDriver();
        String url="https://the-internet.herokuapp.com/dropdown";
        driver.get(url);
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        selectDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        dropDownOptions = selectDropDown.getOptions();
        assertTrue(!dropDownOptions.isEmpty());
    }

}
