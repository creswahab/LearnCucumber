package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExampleDef {
	@Given("User should have passed High School")
	public void user_should_have_passed_high_school() {
	   System.out.println("User should have passed High School");
	}
	@Given("User should have passed High Secondary School")
	public void user_should_have_passed_high_secondary_school() {
		 System.out.println("User should have passed High Secondary School");
	}
	@Given("Joined the Engineering Course")
	public void joined_the_engineering_course() {
		 System.out.println("User should have Joined the Engineering Course");
	}
	@When("Cleared the exams")
	public void cleared_the_exams() {
		 System.out.println("User should have Cleared the exams");
	}
	@Then("Become an Engineer")
	public void become_an_engineer() {
		 System.out.println("User become an Engineer");
	}

	@Given("Joined the Medical Course")
	public void joined_the_medical_course() {
		System.out.println("User should have Joined the Medical Course");
	}
	@When("Cleared the examinations")
	public void cleared_the_examinations() {
		System.out.println("User should have Cleared the examinations");
	}
	@Then("Become a Doctor")
	public void become_a_doctor() {
		System.out.println("User should have become a Doctor");
	}
}
