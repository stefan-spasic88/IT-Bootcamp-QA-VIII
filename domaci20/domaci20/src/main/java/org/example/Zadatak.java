package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Zadatak {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass //jednom pre svega
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Work1//Desktop//Chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod //jednom pre metode
    public void beforeEachTest(){
        driver.get("https://vue-demo.daniel-avellaneda.com/signup");
        driver.manage().window().maximize();

    }

    @Test //Verifikovati da se u url-u stranice javlja ruta "/signup".
    public void verifyUrl(){
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
    }

    @Test //Verifikovati da atribut type u polju za unos email ima vrednost "email" i za password da ima atribut type "password.
    public void typeVerification(){
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        Assert.assertEquals(emailField.getAttribute("type"), "email");
        Assert.assertEquals(passwordField.getAttribute("type"), "password");
    }

    //Proveriti manuelno negativne slučajeve (nevalidan email, kratak password, nepopunjeni podaci…),
    // a zatim za iste napraviti automatske testove za proveru greške ukoliko je prikazana.
    // Pozitivni slučajevi nam ovde nisu od interesa. Poželjno je da bude minimum 5 testova.

    @Test//ID:002-invalid email
    public void invalidEmail() throws InterruptedException {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Marko");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("neki email");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Sifra123");
        WebElement confPassField = driver.findElement(By.id("confirmPassword"));
        confPassField.sendKeys("Sifra123");
        Thread.sleep(2000);
        WebElement signUpBtn =driver.findElement(By.xpath("//span[contains(text(), 'Sign')]"));
        signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Valid')]"))));
        WebElement errorMessageWebElement = driver.findElement(By.xpath("//div[contains(text(), 'Valid')]"));
        String expectedMessage = "Valid email is required";
        Assert.assertEquals(errorMessageWebElement.getText(), expectedMessage);
    }

    @Test //ID:003-Empty email
    public void emptyEmail() throws InterruptedException {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Marko");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Sifra123");
        WebElement confPassField = driver.findElement(By.id("confirmPassword"));
        confPassField.sendKeys("Sifra123");
        Thread.sleep(2000);
        WebElement signUpBtn =driver.findElement(By.xpath("//span[contains(text(), 'Sign')]"));
        signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'required')]"))));
        WebElement errorMessageWebElement = driver.findElement(By.xpath("//div[contains(text(), 'required')]"));
        String expectedMessage = "This field is required";
        Assert.assertEquals(errorMessageWebElement.getText(), expectedMessage);
    }

    @Test//ID:004-empty Name
    public void emptyName() throws InterruptedException {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("x@x.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Sifra123");
        WebElement confPassField = driver.findElement(By.id("confirmPassword"));
        confPassField.sendKeys("Sifra123");
        Thread.sleep(2000);
        WebElement signUpBtn =driver.findElement(By.xpath("//span[contains(text(), 'Sign')]"));
        signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'required')]"))));
        WebElement errorMessageWebElement = driver.findElement(By.xpath("//div[contains(text(), 'required')]"));
        String expectedMessage = "This field is required";
        Assert.assertEquals(errorMessageWebElement.getText(), expectedMessage);
    }

    @Test //ID:005-password with less than 5 character
    public void passwordLessThan5Char() throws InterruptedException {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Marko");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("x@x.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("1234");
        WebElement confPassField = driver.findElement(By.id("confirmPassword"));
        confPassField.sendKeys("1234");
        Thread.sleep(2000);
        WebElement signUpBtn =driver.findElement(By.xpath("//span[contains(text(), 'Sign')]"));
        signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'no less')]"))));
        WebElement errorMessageWebElement = driver.findElement(By.xpath("//div[contains(text(), 'no less')]"));
        String expectedMessage = "This field must have no less than 5 characters";
        Assert.assertEquals(errorMessageWebElement.getText(), expectedMessage);
    }

    @Test //ID:006-password and confirmation password not matching
    public void passwordNotMatching() throws InterruptedException {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Marko");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("x@x.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("abc1234");
        WebElement confPassField = driver.findElement(By.id("confirmPassword"));
        confPassField.sendKeys("ab1234");
        Thread.sleep(2000);
        WebElement signUpBtn =driver.findElement(By.xpath("//span[contains(text(), 'Sign')]"));
        signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'must match')]"))));
        WebElement errorMessageWebElement = driver.findElement(By.xpath("//div[contains(text(), 'must match')]"));
        String expectedMessage = "Passwords must match";
        Assert.assertEquals(errorMessageWebElement.getText(), expectedMessage);
    }

    @Test //ID:007-account already exist with given email
    public void accountAlreadyExist() throws InterruptedException {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Marko");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("admin@admin.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("12345");
        WebElement confPassField = driver.findElement(By.id("confirmPassword"));
        confPassField.sendKeys("12345");
        Thread.sleep(2000);
        WebElement signUpBtn =driver.findElement(By.xpath("//span[contains(text(), 'Sign me up')]"));
        signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[contains(text(), 'E-mail')]"))));
        WebElement errorMessageWebElement = driver.findElement(By.xpath("//li[contains(text(), 'E-mail')]"));
        String expectedMessage = "E-mail already exists";
        Assert.assertEquals(errorMessageWebElement.getText(), expectedMessage);
    }


    @AfterClass
    public void cleanUp(){
        driver.close();
    }
}