package Loginpackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass 
{

	@Given("user is on login page")
	public void verifyloginpage()
	{
		System.out.println("User is on login page");
	}
@When ("user enter valid credentials")
public void enterLogincred()
{
	System.out.println("valid cred entered");
}

@And ("click on login button")
public void click()
{
	System.out.println("clicked on login button");
}

@Then ("user is redirected to home page")
public void redirectedtohome()
{
	System.out.println("User land on homepage");
}

}