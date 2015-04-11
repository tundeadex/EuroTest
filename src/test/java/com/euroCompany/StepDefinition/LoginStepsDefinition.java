package com.euroCompany.StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Babatunde on 08/04/2015.
 */
public class LoginStepsDefinition {

WebDriver EuroTest;
WebDriverWait wait;

@Before
public void set(){
EuroTest = new FirefoxDriver();
wait = new WebDriverWait(EuroTest, 30);
}
@After
public void tearDown(){EuroTest.quit();}
}
