package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTests{

    @Test   //Verifikovati da se u url-u stranice javlja ruta "/signup".
    public void verifyUrl(){
        getSignUpPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }

    @Test   //Verifikovati da atribut type u polju za unos email ima vrednost "email" i za password da ima atribut type "password.
    public void typeVerification() throws InterruptedException {
        getSignUpPage().open();
        WebElement emailField = getDriver().findElement(By.id("email"));
        WebElement passwordField = getDriver().findElement(By.id("password"));
        Thread.sleep(2000);
        Assert.assertEquals(emailField.getAttribute("type"), "email");
        Assert.assertEquals(passwordField.getAttribute("type"), "password");
    }

    @Test  //ID:002-invalid email
    public void invalidEmail(){
        getSignUpPage().open()
                .enterDataToNameField("Marko")
                .enterDataToEmailField("neki email")
                .enterDataToPasswordField("Sifra132")
                .enterDataToConfirmationPassField("Sifra123")
                .clickSignMeUpBtn();
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"))));
        WebElement message = getDriver().findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"));
        String errorMessage = "Valid email is required";
        Assert.assertEquals(message.getText(), errorMessage);
    }

    @Test   //ID:003-Empty email
    public void emptyEmail(){
        getSignUpPage().open()
                .enterDataToNameField("Marko")
                .enterDataToEmailField("")
                .enterDataToPasswordField("Sifra123")
                .enterDataToConfirmationPassField("Sifra123")
                .clickSignMeUpBtn();
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'This field is required')]"))));
        WebElement message = getDriver().findElement(By.xpath("//div[contains(text(), 'This field is required')]"));
        String errorMessage = "This field is required";
        Assert.assertEquals(message.getText(), errorMessage);
    }

    @Test   //ID:004-empty Name
    public void emptyName(){
        getSignUpPage().open()
                .enterDataToNameField("")
                .enterDataToEmailField("x@x.com")
                .enterDataToPasswordField("Sifra123")
                .enterDataToConfirmationPassField("Sifra123")
                .clickSignMeUpBtn();
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'This field is required')]"))));
        WebElement message = getDriver().findElement(By.xpath("//div[contains(text(), 'This field is required')]"));
        String errorMessage = "This field is required";
        Assert.assertEquals(message.getText(), errorMessage);
    }

    @Test   //ID:005-password with less than 5 character
    public void passwordLessThan5Char(){
        getSignUpPage().open()
                .enterDataToNameField("Marko")
                .enterDataToEmailField("x@x.com")
                .enterDataToPasswordField("1234")
                .enterDataToConfirmationPassField("1234")
                .clickSignMeUpBtn();
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"))));
        WebElement message = getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5 characters')]"));
        String errorMessage = "This field must have no less than 5 characters";
        Assert.assertEquals(message.getText(), errorMessage);
    }

    @Test   //ID:006-password and confirmation password not matching
    public void passwordNotMatching(){
        getSignUpPage().open()
                .enterDataToNameField("Marko")
                .enterDataToEmailField("x@x.com")
                .enterDataToPasswordField("abc1234")
                .enterDataToConfirmationPassField("ab1234")
                .clickSignMeUpBtn();
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//div[contains(text(), 'Passwords must match')]"))));
        WebElement message = getDriver().findElement(By.xpath("//div[contains(text(), 'Passwords must match')]"));
        String errorMessage = "Passwords must match";
        Assert.assertEquals(message.getText(), errorMessage);
    }

    @Test   //ID:007-account already exist with given email
    public void accountAlreadyExist() throws InterruptedException {
        getSignUpPage().open()
                .enterDataToNameField("Marko")
                .enterDataToEmailField("admin@admin.com")
                .enterDataToPasswordField("12345")
                .enterDataToConfirmationPassField("12345")
                .clickSignMeUpBtn();
        Thread.sleep(2000);
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//li[contains(text(), 'E-mail already exists')]"))));
        WebElement message = getDriver().findElement(By.xpath("//li[contains(text(), 'E-mail already exists')]"));
        String errorMessage = "E-mail already exists";
        Assert.assertEquals(message.getText(), errorMessage);
    }
}
