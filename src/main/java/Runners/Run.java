package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/SecondTest.feature",
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class Run extends AbstractTestNGCucumberTests {
}
