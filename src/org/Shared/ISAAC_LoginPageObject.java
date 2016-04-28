package org.Shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class ISAAC_LoginPageObject {

	public ISAAC_LoginPageObject(){
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(id="_58_login")	public WebElement Field_Username;	
	@FindBy(name="_58_password") public WebElement Field_Password;	
	@FindBy(className="aui-button-content") public WebElement btnLogin;
	@FindBy(xpath="//img[@title='Nederlands']") public WebElement taalInstellingNL;
	
	
	public void setText_TaalNederlands(){
		taalInstellingNL.click();
	}
	
	public void setText_UsernameLogin(String text){
		Field_Username.sendKeys(text);
		Assert.assertEquals(Field_Username.getAttribute("value"), text);
	}
	
	public void setText_PasswordLogin(String text){
		Field_Password.sendKeys(text);
		Assert.assertEquals(Field_Password.getAttribute("value"), text);
	}
	
	public ISAAC_HomePage ClickLogin(){
		btnLogin.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href*='logout']")));
		return new ISAAC_HomePage();
	}
}
