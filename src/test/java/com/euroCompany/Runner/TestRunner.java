package com.euroCompany.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Babatunde on 08/04/2015.
 */


@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/resources"}, tags = {"@EuroTest1"})
@CucumberOptions(features = {"src/test/resources"},glue = {"com.euroCompany.StepDefinition"}, tags = {"@EuroTest2"})
public class TestRunner {
}
