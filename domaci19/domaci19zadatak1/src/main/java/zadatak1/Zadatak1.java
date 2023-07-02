package zadatak1;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Napraviti maven projekat i dodati selenium dependency i dependency za Faker.
U Mainu preko selenijuma otici na https://demoqa.com/text-box.
Zadatak je da popunite sva polja (Full Name, email, Current Address, Permanent Address) i da kliknete submit koristeci Faker.
Uporediti da li u rezultatu (ispod submit), full name i email su isti kao uneseni pre submita, da nije doslo do izmene.
Upisati odgovarajucu poruku ako su isti ili ako se razlikuju podaci.
 */
public class Zadatak1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users//Work1//Desktop//Chromedriver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        Faker faker = new Faker();

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submit = driver.findElement(By.id("submit"));

        fullName.sendKeys(faker.name().fullName());
        email.sendKeys(faker.internet().emailAddress());
        currentAddress.sendKeys(faker.address().fullAddress());
        permanentAddress.sendKeys(faker.address().fullAddress());
        submit.click();

        WebElement outputFullName = driver.findElement(By.id("name"));
        WebElement outputEmail = driver.findElement(By.id("email"));

        String fullNameResult = outputFullName.getText();
        String emailResult = outputEmail.getText();

        if (fullNameResult.contains(fullName.getAttribute("value")) && emailResult.contains(email.getAttribute("value"))) { //radi i sa fullName.getText() umesto fullName.getAttribute("value")
            System.out.println("Podaci su isti!");
        } else {
            System.out.println("Podaci su razliciti!");
        }

        driver.close();
    }
}
