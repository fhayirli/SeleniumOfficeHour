package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T002_FaceBookUrlCheck {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: Title and Url check
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        //2. Go to https://www.facebook.com
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        //3. Verify url contains facebook
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        if (currentUrl.contains("facebook")) {
            System.out.println("Facebook URL verification PASSED");
        }else {
            System.out.println("Facebook URL verification FAILED");
        }
        ;
        //4. Verify title contains Facebook
        String currentTitle = driver.getTitle();
        if (currentTitle.contains("Facebook")) {
            System.out.println("Facebook Title verification PASSED");
        }else {
            System.out.println("Facebook Title verification FAILED");
        }

        waitFor(2);

        //5. Navigate to https://www.google.com
        driver.navigate().to("https://www.google.com");

        //6. Verify url contains google
       currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        if (currentUrl.contains("google")) {
            System.out.println("Google URL verification PASSED");
        }else {
            System.out.println("Google URL verification FAILED");
        }
        //7. Verify title contains Google
         currentTitle = driver.getTitle();
        if (currentTitle.contains("Google")) {
            System.out.println("Google Title verification PASSED");
        }else {
            System.out.println("Google Title verification FAILED");
        }
        waitFor(2);

        //8. Navigate back
        driver.navigate().back();
        //9. Verify url contains facebook
        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        if (currentUrl.contains("facebook")) {
            System.out.println("Facebook URL verification PASSED");
        }else {
            System.out.println("Facebook URL verification FAILED");
        }
      waitFor(2);

        //10.Navigate forward
        driver.navigate().forward();
        //11.Verify url contains google
        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        if (currentUrl.contains("google")) {
            System.out.println("Google URL verification PASSED");
        }else {
            System.out.println("Google URL verification FAILED");
        }

        waitFor(2);
        driver.navigate().back();
        verifyWordContains(currentTitle,"Facebook");

driver.close();//only close the window without killing the driver object
driver.quit();//killing the driver
    }
private static void verifyWordContains(String sentence, String word) {

        if (sentence.toLowerCase().contains(word.toLowerCase())) {
            System.out.println( word+" Title verification PASSED");
        }else {
            System.out.println(word+ " Title verification PASSED");
        }

}
    private static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
