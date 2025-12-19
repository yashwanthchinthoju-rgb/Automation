package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/Urbuddi.feature",   // recommended folder
        glue = "stepDefinitions",
        tags = "@Accounts",
        plugin = {
                    "pretty",
                    "html:target/Accounts.html",
                    "json:target/Accounts.json"
        },
        monochrome = true
)
public class LoginRunner {
}
