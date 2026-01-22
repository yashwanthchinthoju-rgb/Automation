package Methods;

import Locators.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    Locators loc = new Locators();

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterEmail(String email) {
        driver.findElement(loc.Emailfield).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(loc.Passwordfield).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loc.LoginButton).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

    public boolean isInvalidCredentialDisplayed() {
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(loc.Invalid));
        return msg.isDisplayed();
    }

    public boolean isLogoDisplayed() {
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(loc.LogoCheck));
        return logo.isDisplayed();
    }
}
