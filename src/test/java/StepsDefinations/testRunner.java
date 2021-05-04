package StepsDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/login.feature", 
	glue={"StepsDefinations"},
	//plugin = {"pretty", "html:target/HTMLReports"})
	plugin = {"json:target/cucuber-report-html/cucumber.json"})


public class testRunner {

	
	
	
}
