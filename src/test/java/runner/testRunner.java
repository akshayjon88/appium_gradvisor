package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepdefine",monochrome=true)
public class testRunner extends AbstractTestNGCucumberTests {

	
	
}
