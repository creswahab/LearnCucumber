package StepDefinition;

import io.cucumber.java.en.Given;

public class RegualarExpressDef {

	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	    System.out.println("Laptip count is " +int1);
	
	}
	@Given("I have scored {double} CGPA")
	public void i_have_scored_cgpa(Double num) {
		System.out.println("CGPA is "+num);
	}
	@Given("{string} is bigger than {string} and {string}")
	public void is_bigger_than_and(String name1, String name2, String name3) {
	    System.out.println(name1+" is bigger than "+name2+" and " + name3);
	}

	
	
}
