package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{
    @FindBy(id = "name")
    WebElement nameField;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "confirmPassword")
    WebElement confirmationPasswordField;

    @FindBy(xpath = "//span[contains(text(), 'Sign me up')]")
    WebElement signMeUpBtn;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(), this);
    }
    public void enterDataToNameField(String text){
        nameField.sendKeys(text);
    }
    public void enterDataToEmailField(String text){
        emailField.sendKeys(text);
    }
    public void enterDataToPasswordField(String text){
        passwordField.sendKeys(text);
    }
    public void enterDataToConfirmationPasswordField(String text){
        confirmationPasswordField.sendKeys(text);
    }
    public void clickSignMeUpBtn(){
        signMeUpBtn.click();
    }
    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
}
