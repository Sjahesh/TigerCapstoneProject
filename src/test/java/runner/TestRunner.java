package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportConfig;

//In Java and selenium if we want to Execut or Run our code ortest we use main method but for cucumber and BDD frameworke we use Junit initition to run
//our test and we use the below Cucumber initition and pass Cucumber.Class inside the paremeter and below should be outside of our class to let us import.
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature",// it is path to the feature folder 
		glue = "step.definition",// with this we we can glue our step.definition with feature class
		tags ="@HomePageCompleteTest",//if we have 4 defferent feature files if we want run all of them at we should add @name (regression) text in each feature file then 
		dryRun = false, // If we set this to true, check the FF for the tag that we added to our testRunner class and if we use false then it will run all the test that we wrote right click and run as Junit
		monochrome = true,// It means that once the codes are printed in counsle we can capy and past them
		plugin= {
				"pretty","html:target/site/cucumber-pretty",
				"json:target/cucumber.json",
		},
		publish = true
		)

public class TestRunner {
	@AfterClass
	public static void generateReport() {
		CucumberReportConfig.reportConfig();
	
	}

}