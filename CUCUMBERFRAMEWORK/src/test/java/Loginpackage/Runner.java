package Loginpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="/CUCUMBERFRAMEWORK/src/test/resources/Cucumber folder",glue= {"LoginPackage"},plugin={"pretty","html:/CUCUMBERFRAMEWORK/target/htmlreport"})
public class Runner
{
	
	
}
