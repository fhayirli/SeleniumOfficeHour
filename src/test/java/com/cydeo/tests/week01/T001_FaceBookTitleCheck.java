package com.cydeo.tests.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T001_FaceBookTitleCheck {

    public static void main(String[] args) {

        //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        //2. Go to https://www.facebook.com
        WebDriver driver = new ChromeDriver();//polymorphism
        driver.manage().window().maximize();//method chaining
        driver.get("https://www.facebook.com");
        //3. Verify title:
        //Expected: “Facebook – log in or sign up”

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Facebook Title verification PASSED");//Facebook Title verification PASSED
        }else {
            System.out.println("Facebook Title verification FAILED");
        }




    }


}
