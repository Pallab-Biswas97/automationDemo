package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src/test/java/features", 
				glue = { "stepsDefination" },
				monochrome = true, 
				tags = "@activeTest",dryRun=false)
public class TestRunner {
}