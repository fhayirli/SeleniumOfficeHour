package com.cydeo.tests.selfStudy;

import com.cydeo.tests.tests.base.VytrackBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tc001 extends VytrackBase {

    public static List<String> getTexts(List<WebElement> elements){

        List<String> result = new ArrayList<>();

        for (WebElement element : elements){

            String eachText = element.getText();
            result.add(eachText);

        }
       return result;
    }



    @Test
    public void test1() {

        //TC 1- As a user I should be able to see the labels [“Home”,”About us”,”Our Approach”,”Products and Services”,” Contact”,”LOGIN”]
        //1- Open a Chrome browser
        //2- Go to "https://vytrack.com/"
        //3- Verify that ["Home","About us","Our Approach","Products and Services","Contact","LOGIN"] is displayed

            List<String> expectedLabel = new ArrayList<>(Arrays.asList("Home", "About us", "Our Approach", "Products and Services", "Contact","LOGIN"));

            List<WebElement> elements =driver.findElements(By.xpath("//ul[@id='top-menu']/li"));
            List<String> actualLabel = BrowserUtils.getTexts(elements);

            Assert.assertEquals(actualLabel,expectedLabel);




    }

    @Test
    public void test2() {

//TC 2- As a user I should be able to see the labels ["Our Mission and Vision","Car Fleet Management","Newest Technologies"] under Our Approach
//1- Open a chrome browser
//2- Go to "https://vytrack.com/""
//3- Verify that ["Our Mission and Vision","Car Fleet Management","Newest Technologies"] is displayed




    }
}
