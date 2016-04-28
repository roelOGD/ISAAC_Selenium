package org.Shared;

import org.openqa.selenium.support.PageFactory;

public class ISAAC_HomePage {

	public ISAAC_HomePage(){
		System.out.println("test1 "+StaticClass.driver);
		PageFactory.initElements(StaticClass.driver, this);
	}	
}
