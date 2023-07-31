package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/Login.feature","src/test/java/features/AddToCart.feature","src/test/java/features/Logout.feature"},
        glue = {"stepdefinition"}
)
public class runner extends AbstractTestNGCucumberTests {
}