package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HoversPage extends BasePage{


public void hoverOverUser(int userNum) {
    String locator = "(//img)[" + userNum + "]";
   WebElement element = Driver.getDriver().findElement(By.xpath(locator));

    BrowserUtils.hover(element);
}
    //I need to have one method for hover;





public String getUserName(int userName){
    String locator = "(//h5)["+userName+"]";
    return Driver.getDriver().findElement(By.xpath(locator)).getText();
}



}
