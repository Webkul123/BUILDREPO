package com.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Stepdefinations 

{
	WebDriver driver = null;


	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\eclipse-workspace\\XML\\Datadriven\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("User land on login page")
	public void user_land_on_login_page() {
	   driver.get("https://example.testproject.io/web/");
	}

	@When("^Enter (.*) and (.*)%")
	public void entercredentials(String username,String password) {
	    WebElement username1= driver .findElement(By.xpath("//input[@id='name']") );
	    username1.sendKeys(username);
	    WebElement password1= driver.findElement(By.xpath("//input[@id='password']") );
	    password1.sendKeys(password);
	   

	    
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		WebElement submit= driver.findElement(By.id("login"));
		   submit.click();
	}

	@Then("User should be redirected to HOME page.")
	public void user_should_be_redirected_to_HOME_page() {
	    String verificationpoint1 = driver.getTitle();
	    WebElement logoutbutton = driver.findElement(By.id("logout"));
	  String buttontext=  logoutbutton.getText();
	    logoutbutton.isDisplayed();
	    Assert.assertEquals("Logout", buttontext);
	}
 


	
	

}
