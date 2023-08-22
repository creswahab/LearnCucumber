package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestMethod {
	
	 WebDriver driver;

	@Given("User is on login page")
	public void User_is_on_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@When("Enter the username and password")
	public void enter_the_username_and_password() {
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	@Then("press the login button")
	public void press_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
}
