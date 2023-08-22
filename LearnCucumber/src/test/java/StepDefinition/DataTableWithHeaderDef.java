package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithHeaderDef {
	
	WebDriver driver;

	@Given("You are on login page")
	public void you_are_on_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("user entered the below valid credentials")
	public void user_entered_the_below_valid_credentials(DataTable dataTable) {
		List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
		String username = credentials.get(0).get("username");
		String password = credentials.get(0).get("password");
		
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("click the login")
	public void click_the_login() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}


}
