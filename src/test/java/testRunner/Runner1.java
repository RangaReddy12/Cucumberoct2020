package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},monochrome=true,glue= {"stepDefinations"},
tags= {"@loginsingledata"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/login.html","pretty", "html:target/cucumber-reports"})
public class Runner1 {

}
