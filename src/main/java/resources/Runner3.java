package resources;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Runner3 {
	@RunWith(Cucumber.class)
	@CucumberOptions(features= {"FeatureFiles"},tags= {"@loginmultipledata"},glue= {"stepDefinations"},
	monochrome=true,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/login.html","pretty", "html:target/cucumber-reports"})
	public class Runner2 extends AbstractTestNGCucumberTests{

	}
}
