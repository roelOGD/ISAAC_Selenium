package org.Methods;

import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uitloggen extends StaticClass {
	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}

	public static void uitloggen() throws InterruptedException{
		
		try{
			StaticClass.driver.findElement(By.xpath("//a[@href='/c/portal/logout']")).click();
			WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Aanmelden']")));
		}
		catch(Exception e){
			Thread.sleep(500);
			StaticClass.driver.findElement(By.xpath("//a[@href='/c/portal/logout']")).click();
			WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Aanmelden']")));
		}
	}
}
