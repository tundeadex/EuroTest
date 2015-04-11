package com.euroCompany.PageObjects;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

/**
 * Created by Babatunde on 08/04/2015.
 */
public class EuroTestLoginPage {
WebDriver myDriver;

    public EuroTestLoginPage(WebDriver driver){
    myDriver= driver;
    }
public void fillLoginForm(String username, String password){
myDriver.findElement(By.cssSelector("")).sendKeys(username);
myDriver.findElement(By.cssSelector("")).sendKeys(password);
myDriver.findElement(By.cssSelector("")).click();
}

    public boolean checkAccountIsOpened(){
return myDriver.getTitle().equals("");
}
}

