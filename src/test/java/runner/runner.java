package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = {"StepDefinitions"},
        tags = "@BuyTv",

        dryRun = false,
        plugin = {"pretty", "html:target/cucumber_reports.html"})


public class runner {
}
