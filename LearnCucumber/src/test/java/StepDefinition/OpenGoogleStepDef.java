package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OpenGoogleStepDef {

	 WebDriver driver;
	
	@Given("User is opening Google page")
	public void user_is_opening_google_page() {
	    driver = new ChromeDriver();
	    driver.get("https://www.google.co.in");
	}
	@When("type the search term")
	public void type_the_search_term() {
	   driver.findElement(By.name("q")).sendKeys("Jupiter");;
	    
	}
	@When("press the enter key")
	public void press_the_enter_key() {
		driver.findElement(By.name("q")).submit();
	}
	@Then("Result should be displayed")
	public void result_should_be_displayed() {
	  boolean status = driver.findElement(By.linkText("Jupiter")).isDisplayed();
	  Assert.assertTrue(status);
	}

}
