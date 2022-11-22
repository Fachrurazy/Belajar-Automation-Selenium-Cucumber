package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {".\\src\\test\\resources\\Features\\RegistrasiJitest.feature"},
        glue = {"steps"},
        plugin = {"pretty","json:target/cucumber-reports/reports.json","junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/reports2.html"},monochrome = true,
        dryRun = false
)

public class runner {
}
