package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithExampleDef {
	
	WebDriver driver;

	@Given("You open login page")
	public void you_open_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("user provid the valid {string} and {string}")
	public void user_provid_the_valid_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("perform the login")
	public void perform_the_login() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("User is navigated to Homepage")
	public void user_is_navigated_to_homepage() {
		boolean status = driver.findElement(By.partialLinkText("Admin")).isDisplayed();
		Assert.assertTrue(status);
	}

}
