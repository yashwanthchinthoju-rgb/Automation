package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    Locators.LoginPage loc;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        loc = new Locators.LoginPage();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void email(String Email){

        WebElement emailfield = driver.findElement(loc.Emailfield);
        emailfield.sendKeys(Email);

    }

    public void password(String Password){

        WebElement password = driver.findElement(loc.Passwordfield);
        password.sendKeys(Password);

    }

    public void loginButton(){

        WebElement LoginButton = driver.findElement(loc.LoginButton);
        LoginButton.click();

    }


    public boolean invalid(){

        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(loc.Invalid));
        return msg != null && msg.getText().contains("Invalid credentials");

    }

    public boolean logoCheck(){
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(loc.LogoCheck));

        if (logo == null) {
            return false;
        }
        return logo.isDisplayed();

    }
}
