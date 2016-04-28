package org.Shared;

import org.Aanvrager.AanvraagObjects_Algemeen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMenuMethods {
	
	public void goToHomePageNL(){
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='home']")));
		element.click();
	}
	
	public void goToAanvragenPageNL(){
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='subsidieaanvraag']")));
		element.click();
	}
	
	public void goToProjectenPageNL(){
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='projecten1']")));
		element.click();
	}
	
	public void goToHelpPageNL(){
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='help']")));
		element.click();
	}

	public AanvraagObjects_Algemeen goToSpecifiekeAanvraag(String aanvraagUrl) {
		StaticClass.driver.get(aanvraagUrl);
		// Check of je op de goede pagina bent door naar de laatste 7 characters van de url te kijken 
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.urlContains(aanvraagUrl.substring(aanvraagUrl.length() - 7)));
		// Geef een aanvraag Object door
		return new AanvraagObjects_Algemeen();
	}
	
}
