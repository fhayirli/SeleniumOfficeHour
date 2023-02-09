package com.cydeo.tests.week02;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import com.github.javafaker.HarryPotter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001 {

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("http://automationexercise.com");

    }

    @Test
    public void verifyHomePage() {
   /*
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    */
        BrowserUtils.verifyTitle(driver,"Automation Exercise");
    }

    @Test
    public void verifyNewUserSignupLabel() {

        clickModule("Signup / Login");

        WebElement labelForSignUp = driver.findElement(By.xpath("//h2[.='New User Signup!']"));
        Assert.assertTrue(labelForSignUp.isDisplayed());

    }

    private void clickModule(String moduleName) {

        String locator = "//a[contains(., '"+moduleName+"')]";
        driver.findElement(By.xpath(locator)).click();
    }

    @Test
    public void verifyAccountInfo() {

        clickModule("Signup / Login");
        Faker faker = new Faker();
      // HarryPotter name= faker.harryPotter();
       String name = faker.name().firstName();
       String email = name+faker.number().numberBetween(1,1000)+"@gmail.com";
       //faker.internet().emailAddress();

        WebElement nameElement= driver.findElement(By.xpath("//input[@name='name']"));
        nameElement.sendKeys(name);

        WebElement emailElement= driver.findElement(By.xpath("(//input[@name='email'])[2]"));
        emailElement.sendKeys(email);
        WebElement signUpButton = driver.findElement(By.xpath(" //button[.='Signup']"));
        signUpButton.click();

        WebElement label = driver.findElement(By.xpath("//h2[contains(.,'Enter Account Information')]"));
        Assert.assertTrue(label.isDisplayed());
    }

    @Test
    public void verifyAccountCreation() {
        //9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible

WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
gender.click();

WebElement name = driver.findElement(By.xpath("//input[@id='name']"));




    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
