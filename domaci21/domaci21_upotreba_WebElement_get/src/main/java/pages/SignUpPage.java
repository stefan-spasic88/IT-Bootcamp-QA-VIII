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
        nameField = getDriver().findElement(By.id("name"));//moze i sa this.nameField...
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
    public WebElement getConfirmationPassField(){
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
    public void enterDataToNameField(String text){
        getNameField().sendKeys(text);
    }

    public void enterDataToEmailField(String text){
        getEmailField().sendKeys(text);
    }
    public void enterDataToPasswordField(String text){
        getPasswordField().sendKeys(text);
    }
    public void enterDataToConfirmationPassField(String text){
        getConfirmationPassField().sendKeys(text);
    }
    public void clickSignMeUpBtn(){
        getSignMeUpBtn().click();
    }
    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
}
