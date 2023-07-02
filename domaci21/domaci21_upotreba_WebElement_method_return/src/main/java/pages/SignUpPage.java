package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmationPassField;
    private WebElement signMeUpBtn;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    /**
     * Getters
     */
    public WebElement getNameField(){
        nameField = getDriver().findElement(By.id("name"));
        return nameField;
    }
    public WebElement getEmailField(){
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }
    public WebElement getPasswordField(){
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }
    public WebElement getConfirmationPassField() {
        confirmationPassField = getDriver().findElement(By.id("confirmPassword"));
        return confirmationPassField;
    }
    public WebElement getSignMeUpBtn(){
        signMeUpBtn = getDriver().findElement(By.xpath("//span[contains(text(), 'Sign me up')]"));
        return signMeUpBtn;
    }
    /**
     * Methods
     */
    public SignUpPage enterDataToNameField(String text){
        getNameField().sendKeys(text);
        return this;
    }
    public SignUpPage enterDataToEmailField(String text){
        getEmailField().sendKeys(text);
        return this;
    }
    public SignUpPage enterDataToPasswordField(String text){
        getPasswordField().sendKeys(text);
        return this;
    }
    public SignUpPage enterDataToConfirmationPassField(String text){
        getConfirmationPassField().sendKeys(text);
        return this;
    }
    public SignUpPage clickSignMeUpBtn(){
        getSignMeUpBtn().click();
        return this;
    }
    public SignUpPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }
}
