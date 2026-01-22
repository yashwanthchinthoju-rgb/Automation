package stepDefinitions;

import Methods.LoginPage;
import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginValidationSteps {

    LoginPage login;

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        login = new LoginPage(Hooks.driver);
        login.login(username, password);
    }

    @Then("login result should be {string}")
    public void login_result_should_be(String result) {

        if (result.equalsIgnoreCase("pass")) {
            Assert.assertTrue(login.isLogoDisplayed());
        } else {
            Assert.assertTrue(login.isInvalidCredentialDisplayed());
        }
    }
}
