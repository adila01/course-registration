package org.mule.modules.googlecalendarimpersonate.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.googlecalendarimpersonate.automation.functional.AddEntityTestCases;
import org.mule.modules.googlecalendarimpersonate.automation.functional.GreetTestCases;
import org.mule.modules.googlecalendarimpersonate.GoogleCalendarImpersonateConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({
	AddEntityTestCases.class,

GreetTestCases.class
})

public class FunctionalTestSuite {
	
	@BeforeClass
	public static void initialiseSuite(){
		ConnectorTestContext.initialize(GoogleCalendarImpersonateConnector.class);
	}
	
	@AfterClass
    public static void shutdownSuite() {
    	ConnectorTestContext.shutDown();
    }
	
}