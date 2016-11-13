import Pages.Page;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/reports", "json:target/cucumber.json" },
        monochrome = true, strict = false, dryRun = false)
public class RunCucumberTests {
}
