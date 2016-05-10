package org.Aanvrager.Relatiebeheer;

import org.Shared.BaseMethodsClass;
import org.Shared.StaticClass;
import org.openqa.selenium.support.PageFactory;

public class AanvragerKoppelenAanWerkzaamheidHomePage {
	public AanvragerKoppelenAanWerkzaamheidHomePage(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
		
	public void koppelWerkzaamheid() throws InterruptedException{
		BaseMethodsClass.hoverClickByXPATHEnWacht("td", "class", "table-column", "input", "value", "Selecteren", "Wacht.By.id", null, null, "button-rb-link_2");	
	}
}
