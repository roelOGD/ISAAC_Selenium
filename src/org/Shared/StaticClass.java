package org.Shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class StaticClass {
	 public static WebDriver driver = new FirefoxDriver();
	  
	 public WebDriver getDriver(){
	         System.out.println("Driver "+driver);
	         return driver;
	     }

 
}
