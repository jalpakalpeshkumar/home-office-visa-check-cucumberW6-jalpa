package gov.uk.check.visa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Jay Vaghani
 */

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "gov/uk/check/visa",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke or @sanity"


)
public class RunCukeTest extends AbstractTestNGCucumberTests {


}