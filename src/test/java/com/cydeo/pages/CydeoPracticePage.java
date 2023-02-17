package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CydeoPracticePage extends BasePage{

    public CydeoPracticePage(){


    }
    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//a[contains(.,'A/B Testing')]")
    public WebElement link;

public void clickOption(String optionName){

    String locator = "//a[contains(.,'"+optionName+"')]";

    WebElement element = Driver.getDriver().findElement(By.xpath(locator));
    BrowserUtils.scrollToElement(element);
    BrowserUtils.clickElement(element);
}



}
