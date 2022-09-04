package com.stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/Multiuserlogin.feature",glue= {"com.stepdefinations"},tags= {"@Smoke"},plugin= {"pretty","html:/Datadriven/targethtmlreport.html"})

public class Test {

}
