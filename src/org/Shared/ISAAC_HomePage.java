package org.Shared;

import org.openqa.selenium.support.PageFactory;

public class ISAAC_HomePage {

	public ISAAC_HomePage(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
}
