package org.Aanvrager;

import java.util.List;

import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AanvraagObjects_Details {
	public AanvraagObjects_Details(){
		PageFactory.initElements(StaticClass.driver, this);
	}

	public void AanvraagIntrekken() throws InterruptedException{
		Thread.sleep(1000);
		Actions action = new Actions(StaticClass.driver);
		List<WebElement> we = StaticClass.driver.findElements(By.xpath("//input[@name='context_uitklap']"));
		WebElement eerste = we.get(0);
		eerste.click();
		action.moveToElement(eerste).click().moveToElement(StaticClass.driver.findElement(By.id("Intrekken_1"))).click().build().perform();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Aanvraag-Intrekkingsbevestiging_1")));
		StaticClass.driver.findElement(By.xpath("//label[@class='for-checkbox uncheck']")).click();
		StaticClass.driver.findElement(By.id("Aanvraag-Intrekkingsreden_1")).sendKeys("Deze aanvraag is automatisch ingetrokken");
		StaticClass.driver.findElement(By.xpath("//input[@id='Vastleggen_1']")).click();
		
		// Wacht tot de knop 'verder' is geladen
		WebDriverWait wait2 = new WebDriverWait(StaticClass.driver, 10);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("Verder_1")));
	}
	
	public void weerwoordIndienen() throws InterruptedException{
		Thread.sleep(1000);
		Actions action = new Actions(StaticClass.driver);
		List<WebElement> we = StaticClass.driver.findElements(By.xpath("//input[@name='context_uitklap']"));
		WebElement eerste = we.get(0);
		eerste.click();
		action.moveToElement(eerste).click().moveToElement(StaticClass.driver.findElement(By.id("Weerwoord_2"))).click().build().perform();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Indienen_1")));
		StaticClass.driver.findElement(By.id("WeerwoordItem-Reactie_1")).sendKeys("Dit is een automatisch weerwoord");
		StaticClass.driver.findElement(By.id("Weerwoord-Reactie_1")).sendKeys("Dit is een automatisch weerwoord");
		StaticClass.driver.findElement(By.xpath("//input[@id='Indienen_1']")).click();
		WebDriverWait wait2 = new WebDriverWait(StaticClass.driver, 10);
		wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@class='pagetitle']"), "Bevestiging indienen"));
		StaticClass.driver.findElement(By.xpath("//input[@id='Indienen_1']")).click();
	}
	
	public void afzienVanWeerwoord() throws InterruptedException{
		Thread.sleep(1000);
		Actions action = new Actions(StaticClass.driver);
		List<WebElement> we = StaticClass.driver.findElements(By.xpath("//input[@name='context_uitklap']"));
		WebElement eerste = we.get(0);
		eerste.click();
		action.moveToElement(eerste).click().moveToElement(StaticClass.driver.findElement(By.id("Weerwoord_2"))).click().build().perform();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Indienen_1")));
		StaticClass.driver.findElement(By.xpath("//label[@class='for-checkbox uncheck']")).click();
		StaticClass.driver.findElement(By.xpath("//input[@id='Indienen_1']")).click();
		WebDriverWait wait2 = new WebDriverWait(StaticClass.driver, 10);
		wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@class='pagetitle']"), "Bevestiging indienen"));
		StaticClass.driver.findElement(By.xpath("//input[@id='Indienen_1']")).click();
	}

}
