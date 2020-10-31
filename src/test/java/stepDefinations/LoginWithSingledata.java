package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithSingledata {
	WebDriver driver;
	@Given("^i launch url in chrome browser$")
	public void i_launch_url_in_chrome_browser() throws Throwable
	{
	  driver= new ChromeDriver();
	  driver.get("http://orangehrm.qedgetech.com/");
	  driver.manage().window().maximize();
	}

	@When("^i enter username in textbox  and i enter password in textbox$")
	public void i_enter_username_in_textbox_and_i_enter_password_in_textbox() throws Throwable {
	   driver.findElement(By.name("txtUsername")).sendKeys("Admin"); 
	   driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#"); 
	}

	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
		 driver.findElement(By.name("Submit")).click(); 
		 Thread.sleep(5000);
	    
	}

	@Then("^i verify url$")
	public void i_verify_url() throws Throwable {
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login Fail");
		}
	    
	}

	@Then("^i close browser$")
	public void i_close_browser() throws Throwable {
		Thread.sleep(5000);
		driver.close();
	}

}
