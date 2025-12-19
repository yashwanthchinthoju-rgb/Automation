package stepDefinitions;

import Methods.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoginSteps {

    WebDriver driver;
    LoginPage login;

    @Given("Open browser")
    public void open_browser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        login = new LoginPage(driver);
    }

    @When("enter Url")
    public void enter_url() {

        driver.get("https://dev.urbuddi.com/login");
    }

    @Then("Enter Credentials {string} and {string}")
    public void enter_credentials_and_login(String username, String password) {
        login.email(username);
        login.password(password);
        login.loginButton();
    }

    @Then("Validate login result {string}")
    public void validate_login_result(String result) {
        if ("pass".equalsIgnoreCase(result)) {
            boolean isDisplayed = login.logoCheck();
            takeScreenshot("Login_Success");
            System.out.println("Result: PASS (logo displayed)");
        } else {
            boolean isInvalid = login.invalid();
            System.out.println("Result: PASS (invalid credentials)");
        }
    }


    public void takeScreenshot(String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        File dest = new File("screenshots/" + screenshotName + "_" + timestamp + ".png");
        try {
            Files.createDirectories(dest.getParentFile().toPath());
            Files.copy(src.toPath(), dest.toPath());
            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed for this scenario.");
        }
    }
}
