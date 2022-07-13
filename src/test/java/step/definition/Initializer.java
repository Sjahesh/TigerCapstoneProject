package step.definition;


import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info(scenario.getName()+ "started");
		//Below methods are coming from Base class.
		browser(); // lunch browser
		openBrowser(); // open url
	}
	@After
	public void afterHooks(Scenario scenario) {
		// We called the below method from Base class.
		tearDown();
		logger.info(scenario.getName()+ " " + scenario.getStatus());
		//We can also write methods here to capture screenshots if the case faild.
	}

}
