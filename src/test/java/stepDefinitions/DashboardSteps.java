package stepDefinitions;

import Methods.LoginPage;
import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class DashboardSteps {

    LoginPage login;

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        login = new LoginPage(Hooks.driver);
        Assert.assertTrue(login.isLogoDisplayed());
    }
}
