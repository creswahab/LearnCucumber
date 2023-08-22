package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithoutHeaderDef {
	
	WebDriver driver;
	
	@Given("User open the login page")
	public void user_open_the_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("user enter the below valid credentials")
	public void user_enter_the_below_valid_credentials(DataTable dataTable) {
		List<List<String>> credentials = dataTable.asLists(String.class);
		String username = credentials.get(0).get(0);
		String password = credentials.get(0).get(1);
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
		
		
	}
	@Then("enter the login button")
	public void enter_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
