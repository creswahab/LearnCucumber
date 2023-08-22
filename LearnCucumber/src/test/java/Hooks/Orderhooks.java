package Hooks;



import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Orderhooks {

	@Before
	public void beforeScenario() {
		 System.out.println("Before All Scenario");
	}
	
	@After
	public void afterScenario() {
		 System.out.println("After All Scenario");
	}

	@Before("@First")
	public void beforeToFirstScenario() {
		 System.out.println("Before First Scenario");
	}
	

	@After("@First")
	public void afterToFirstScenario() {
		 System.out.println("After First Scenario");
	}
	

	@Before("@Second")
	public void beforeToSecondScenario() {
		 System.out.println("Before Second Scenario");
	}
	

	@After("@Second")
	public void afterToSecondScenario() {
		 System.out.println("After Second Scenario");
	}
	

	@Before("@Third")
	public void beforeToThirdScenario() {
		 System.out.println("Before Third Scenario");
	}
	

	@After("@Third")
	public void afterToThirdScenario() {
		 System.out.println("After Third Scenario");
	}
}
