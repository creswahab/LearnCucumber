package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithParameterDef {
	
	WebDriver driver;
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("user enter the valid {string} and {string}")
	public void user_enter_the_valid_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
}
