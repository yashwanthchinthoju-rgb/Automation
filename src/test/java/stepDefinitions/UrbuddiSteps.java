package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UrbuddiSteps {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {

        System.setProperty("webdriver.edge.driver", "C://Users//Admin//Downloads//edgedriver_win64//msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Given("launch browser")
    public void launch_browser() {

    }

    @When("go url")
    public void go_url() {

        driver.get("https://dev.urbuddi.com/login");

    }

    @Then("enter credentials")
    public void enter_credentials() {

        String username = "yashwanth.chinthoju@optimworks.com";
        String password = "Srikrishna@123";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userPassword']"))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
    }

    @Then("check the dashboard")
    public void check_the_dashboard() {
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//p[text()='Dashboard'])[2]"))).getText();
        Assert.assertEquals("Dashboard", text);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
