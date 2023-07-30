package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       features = "src/main/resources/Features",
        glue = "stepDef",
        tags = "@smoke",
        plugin = {
               "pretty",

                "html:target/cucumber.html"
                }

)



public class Runner extends AbstractTestNGCucumberTests {
}
