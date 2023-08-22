package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksConceptDef {
	@Given("travelling to Chennai")
	public void travelling_to_chennai() {
	    System.out.println("Travelling to Chennai");
	}
	@When("staying there at hotel")
	public void staying_there_at_hotel() {
		System.out.println("Staying there at hotel");
	}
	@Then("leaving from chennai")
	public void leaving_from_chennai() {
		System.out.println("Leaving from chennai");
	}


}
