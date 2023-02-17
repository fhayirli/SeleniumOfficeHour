package com.cydeo.tests.selfStudy;

import com.cydeo.tests.tests.base.HMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class HM extends HMBase {



    @Test
    public void test1() {

        WebElement cookiesButton =driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookiesButton.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='attentive_creative']")));

      //  WebElement actualGenderPreferences =driver.findElement(By.xpath("//legend[.='Select your preference:']"));

      //  Assert.assertTrue(actualGenderPreferences.isDisplayed());

        WebElement genderButton = driver.findElement(By.xpath("//label[@for='Women']"));
        genderButton.click();

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='input1input']"));
        inputEmail.sendKeys("ftm@mail.com");

        WebElement continueButton = driver.findElement(By.xpath("//button[@id='ctabutton1']"));
        continueButton.click();


driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@cd_frame_id_='23a4c9a10b438a4f9e21e2e48169b244']")));

WebElement inputTelNum = driver.findElement(By.xpath("//input[@id='input0input']"));
inputTelNum.sendKeys("5195552222");

        driver.switchTo().parentFrame();
    }
}
