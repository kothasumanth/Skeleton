package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featuresfolder",
		glue = {"stepDefinition", "utilities" }
		,tags = {"@timestampexample"}
		, dryRun = false)

public class TestRunner {

}