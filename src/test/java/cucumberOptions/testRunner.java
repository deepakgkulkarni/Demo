package cucumberOptions;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions (
		features="src/test/java/features",
		glue="stepDefinitations")


public class testRunner {

}
