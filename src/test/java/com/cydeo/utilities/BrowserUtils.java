package com.cydeo.utilities;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
This class will be storing only the utility methods that can be used across the project
Thread.sleep method for given duration Arg:int second
 */
public class BrowserUtils {

public static void sleep(int second) {
    second *= 1000;
    try {
        Thread.sleep(second);
    }catch (InterruptedException e) {
        e.printStackTrace();
    }

    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {

    //return and store all window handles in a Set
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));//passed
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {

    Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    public static void verifyTitleContains(WebDriver driver, String expectedInTitle) {

        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));

    }
    }





