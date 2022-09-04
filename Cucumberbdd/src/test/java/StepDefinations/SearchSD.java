package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSD 
{
	WebDriver driver = null;
	@Given("Browser is open")
	
	public void browserOpen()
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
	System.setProperty("webdriver.driver.chromedriver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Inside step-browser is open");	
	} 
	@And("User is on google search page")
	public void onSearchPage()
	{
		driver.get("https://www.google.co.in/");
		String pagetitle= driver.getTitle();
		Assert.assertEquals("Google", pagetitle);
	}
	@When("User enters keyword")
public void entersKeyword()

{
	WebElement keyword=driver.findElement(By.xpath("//input[@tname='q']"));
		keyword.sendKeys("Amazone");
		}

@And("Click on Search button")
public void clicks()
{
	driver.findElement(By.xpath("//input[@tname='q']")).sendKeys(Keys.ENTER);
}

@Then("Search result should be displayed")
public void resultDisplayed()
{
	String pagetitle= driver.getTitle();
	Assert.assertEquals("AMAZON-Google Search", pagetitle);
}
}
