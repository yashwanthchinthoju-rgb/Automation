package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/Urbuddi.feature",   // recommended folder
        glue = "stepDefinitions",
        tags = "@Dashboard",
        plugin = {"pretty",
                "html:target/Dashboard_check.html",
                "json:target/Dashboard_check.json"},
        monochrome = true
)
public class TestRunners { }
