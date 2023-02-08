import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = {"json:target/cucumber-reports/Cucumber.json"},
        tags = "@All"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
