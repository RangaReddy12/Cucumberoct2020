package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginMultiple {
	WebDriver driver;
	String url="http://orangehrm.qedgetech.com/";
	@Given("^launch url in \"([^\"]*)\"$")
	public void launch_url_in(String brw) throws Throwable {
		if(brw.equalsIgnoreCase("chrome"))
		{
			System.out.println("Executing on chrome browser");
			driver= new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
		}
		else if(brw.equalsIgnoreCase("firefox"))
		{
			System.out.println("Executing on firefox browser");
			driver= new FirefoxDriver();
			driver.navigate().to(url);
			
		}
	    
	}

	@When("^user enter \"([^\"]*)\" in username field$")
	public void user_enter_in_username_field(String username) throws Throwable {
	 driver.findElement(By.name("txtUsername")).sendKeys(username);  
	}

	@When("^user enter \"([^\"]*)\" in password field$")
	public void user_enter_in_password_field(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password);  
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
	}

	@Then("^user verify url text$")
	public void user_verify_url_text() throws Throwable {
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login Fail");
		}
	     
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	   driver.close();
	}

}
