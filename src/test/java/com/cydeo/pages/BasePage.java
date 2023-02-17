package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {


        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeLink;
}
