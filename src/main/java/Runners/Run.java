package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/SecondTest.feature",
        glue = {"StepDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {
}
