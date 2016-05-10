package org.Shared;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethodsClass extends StaticClass{
		
		public static Object wachtOpElementById(String WachtElement) throws InterruptedException{
			System.out.println("Gaat nu wachten op aanwezigheid van element: " + WachtElement);
			try{
				WebDriverWait wait = new WebDriverWait(StaticClass.driver, 15);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(WachtElement)));	
				System.out.println("Element is nu present: " + WachtElement);
				return null;
			}
			catch (Exception e){
				System.out.println("Er is een fout opgetreden: " + e);
				System.out.println("Gaat nu een tweede poging wagen");
				Thread.sleep(2000);
				WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(WachtElement)));	
				System.out.println("Element is nu present: " + WachtElement);
				return null;
			}
		}
		
		public static Object wachtOpElementByXPATH(String WachtMethod, String WachtLocater1, String wachtLocater2, String WachtElement) throws InterruptedException{
			System.out.println("Gaat nu wachten op aanwezigheid van element: " + WachtElement);
			try{
				WebDriverWait wait = new WebDriverWait(StaticClass.driver, 15);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//" + WachtLocater1 + "[@"+ wachtLocater2 + "='" + WachtElement + "']")));
				System.out.println("Element is nu present: " + WachtElement);
				return null;
			} 
			catch(Exception e){
				 System.out.println("Er is een fout opgetreden: " + e);
				 System.out.println("Gaat nu een tweede poging wagen");
				 Thread.sleep(2000);
				 WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
				 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//" + WachtLocater1 + "[@"+ wachtLocater2 + "='" + WachtElement + "']")));
				 System.out.println("Element is nu present: " + WachtElement);
				 return null;
			}
		}
		
		public static void clickEnWachtOpElementByID( String element, String wachtMethod, String wachtLocater1, String wachtLocater2, String wachtElement) throws InterruptedException{
			clickOpElementByID(element);

			if( wachtMethod == "Wacht.By.id"){
				wachtOpElementById(wachtElement);
			}
			else if(wachtMethod == "Wacht.By.XPATH"){
				wachtOpElementByXPATH(wachtMethod, wachtLocater1, wachtLocater2, wachtElement);
			}
		}
		
		public static void clickEnWachtOpElementByXPATH( String elementLocater1,String elementLocater2, String element, String wachtMethod, String wachtLocater1, String wachtLocater2, String wachtElement) throws InterruptedException{
			clickOpElementByXPATH(elementLocater1,elementLocater2, element);
			
			if( wachtMethod == "Wacht.By.id"){
				wachtOpElementById(wachtElement);
			}
			else if(wachtMethod == "Wacht.By.XPATH"){
				wachtOpElementByXPATH(wachtMethod, wachtLocater1, wachtLocater2, wachtElement);
			}
		}
		
		public static void clickOpElementByXPATH( String elementLocater1,String elementLocater2, String element) throws InterruptedException{
			System.out.println("In de baseMethodsClass gaat nu op webelement drukken: " + element);
			 try{
				 StaticClass.driver.findElement(By.xpath("//" + elementLocater1 + "[@"+ elementLocater2 + "='" + element + "']")).click();
	            }
			 catch (Exception e){
				 System.out.println("Er is een fout opgetreden: " + e);
				 System.out.println("Gaat nu een tweede poging wagen");
				 Thread.sleep(1000);
				 try{
					 StaticClass.driver.findElement(By.xpath("//" + elementLocater1 + "[@"+ elementLocater2 + "='" + element + "']")).click();
				 }
				 catch(Exception e2){
					 System.out.println("Er is een fout opgetreden: " + e2);
					   ((JavascriptExecutor)StaticClass.driver).executeScript("document.getElementById('elementHtmlId').click();");
				 }
			 }		
		}
		
		public static void clickOpElementByID( String element) throws InterruptedException{
			System.out.println("In de baseMethodsClass gaat nu op webelement drukken: " + element);

			 try{
				 StaticClass.driver.findElement(By.id(element)).click();
	            }
			 catch (Exception e){
				 System.out.println("Er is een fout opgetreden: " + e);
				 System.out.println("Gaat nu een tweede poging wagen");
				 Thread.sleep(1000);
				 try{
					 StaticClass.driver.findElement(By.id(element)).click();
				 }
				 catch(Exception e2){
					 System.out.println("Er is een fout opgetreden: " + e2);
					 System.out.println("Gaat nu een derde poging wagen");
					 Thread.sleep(2000);
					 ((JavascriptExecutor)StaticClass.driver).executeScript("document.getElementById('"+ element + "').click();");
				 }
			 }		
		}

		public static void hoverClickByXPATHEnWacht(String elementLocater1,String elementLocater2, String element, String elementLocater3,String elementLocater4, String element2, String wachtMethod, String wachtLocater1, String wachtLocater2, String wachtElement) throws InterruptedException{
			System.out.println( "elementLocater1: " + elementLocater1 + " elementLocater2: " +  elementLocater2 + " element: " +    element + " elementLocater3: " +    elementLocater3 + " elementLocater4: " +    elementLocater4 + " element2: " +    element2 + " wachtMethod: " +    wachtMethod+ " wachtLocater1: " +     wachtLocater1+ " wachtLocater2: " +     wachtLocater2+ " wachtElement: " +     wachtElement);
			
			
			Actions action = new Actions(StaticClass.driver);
			List<WebElement> we = StaticClass.driver.findElements(By.xpath("//"+ elementLocater1 + "[@" + elementLocater2 + "='"+ element + "']"));
			WebElement eerste = we.get(0);
			eerste.click();
			action.moveToElement(eerste).moveToElement(StaticClass.driver.findElement(By.xpath("//"+ elementLocater3 + "[@" + elementLocater4 + "='"+ element2 + "']"))).click().build().perform();
	
			if( wachtMethod == "Wacht.By.id"){
				wachtOpElementById(wachtElement);
			}
			else if(wachtMethod == "Wacht.By.XPATH"){
				wachtOpElementByXPATH(wachtMethod, wachtLocater1, wachtLocater2, wachtElement);
			}			
		}	
}
