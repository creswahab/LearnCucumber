package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", 
				 glue = {"StepDefinition"},
				 dryRun = false,
				 monochrome=true,
				 plugin = {"html:Reports/WebReport.html", "json:Reports/jsonReport.json", "junit:Reports/xmlReport.xml"},
				 tags = ("@College")
				 )
public class TestRunner {

}
