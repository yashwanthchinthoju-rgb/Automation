package stepDefinitions;

import Methods.LoginPage;
import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {

    LoginPage login;

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        login = new LoginPage(Hooks.driver);
    }

    @And("user navigates to the application url")
    public void user_navigates_to_the_application_url() {
        // URL is already opened in Hooks
    }

    @When("user logs in with valid username and password")
    public void user_logs_in_with_valid_username_and_password() {
        login.login("yashwanth.chinthoju@optimworks.com", "Srikrishna@123");
    }
}
