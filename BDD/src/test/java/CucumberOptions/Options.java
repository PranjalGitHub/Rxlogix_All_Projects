package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Options {

	@RunWith(Cucumber.class)
	@CucumberOptions(  
		    features = "src/test/java/Features",
		    glue="StepsDefinition")
	public class TestRunner {


	}
}
