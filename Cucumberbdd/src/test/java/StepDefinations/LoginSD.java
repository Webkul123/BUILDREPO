package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD 
{
	@Given("User is on log in page")
	public void useronLoginPage()

	{
		{
			System.out.println("User is on login page");
		}
	}
	@When("User enters valid credentials")
	public void entersValidCredentials()
	{
		System.out.println("valid cred entered");
	}

	@And("Click on LOGIN button")
	public void clickonLOGINButton()

	{
		System.out.println("clicked on login button");
	}

	
	@Then("User is redirected to HOME")
	public void redirectedtoHOME()

	{
		System.out.println("User land on homepage");
	}
}