package stepdefination;

import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
public class Step {
	
	WebDriver d;
	
	

	@Given("^when user is in home page$")
	public void when_user_is_in_home_page() throws Throwable {
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.get("https://demo.cyclos.org/");
		assertTrue(d.getTitle().contains("Cyclos4 Communities"));
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^click on signin$")
	public void click_on_signin() throws Throwable {
		d.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	/*@When("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		d.findElement(By.name("principal")).sendKeys("demo");
		d.findElement(By.name("password")).sendKeys("1234");
		d.findElement(By.className("actionButtonText")).click();
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	*/
	
	@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String uname, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.name("principal")).clear();
		d.findElement(By.name("principal")).sendKeys(uname);
		d.findElement(By.name("password")).clear();
		d.findElement(By.name("password")).sendKeys(password);
		d.findElement(By.className("actionButtonText")).click();

	}

	@Then("^verify login link$")
	public void verify_login_link() throws Throwable {
		d.findElement(By.linkText("Logout")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    d.close();
	}

	@Given("^where user is in homepage$")
	public void where_user_is_in_homepage() throws Throwable {
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.get("https://demo.cyclos.org/");
		d.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^enter user name$")
	public void enter_user_name() throws Throwable {
		d.findElement(By.name("principal")).sendKeys("demo");
		Thread.sleep(3000);
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		d.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(3000);
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("^login$")
	public void login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.className("actionButtonText")).click();
		Thread.sleep(3000);
		   
	  
	}

	@Then("^navigate to link$")
	public void navigate_to_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
	}
	
	
	




}
