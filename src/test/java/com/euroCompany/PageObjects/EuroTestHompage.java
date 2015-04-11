package com.euroCompany.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Babatunde on 08/04/2015.
 */
public class EuroTestHompage {

WebDriver myDriver;

    public EuroTestHompage(WebDriver driver){
        myDriver= driver;
    }
public void openEuroHomePage(){
    myDriver.get("http://www.eurostar.com/uk-en");
}
    public boolean amIOnTheHompage() {
        return myDriver.getCurrentUrl().equals("http://www.eurostar.com/uk-en");
    }
public void goToTestLoginPage(){
    myDriver.findElement(By.cssSelector("")).click();
}
public boolean amIOnTestLoginPage(){
    return myDriver.getCurrentUrl().equals("https://www.eurostar.com/uk-en/login");
}
}



