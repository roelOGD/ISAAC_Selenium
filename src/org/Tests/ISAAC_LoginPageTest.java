package org.Tests;

import org.Methods.NewStandaardAanvraag;
import org.POM.data.ISAAC_Data;
import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.Methods.Aanvraag_Acties;

public class ISAAC_LoginPageTest extends StaticClass{
		
		@Override
		public WebDriver getDriver() {
			return super.getDriver();
		}
		
		public static void main (String[] args) throws InterruptedException{
			ISAAC_Data data = new ISAAC_Data();
			
			//NewStandaardAanvraag.NewStandaardAanvraagMaken(data.USERNAME, data.PASSWORD, data.AANVRAAG_URL, data.VOORBEELD_DOCUMENT_PDF, AANVRAAGTITEL);
			//Aanvraag_Acties.aanvraagWeerwoordIndienen(data.USERNAME, data.PASSWORD, data.AANVRAAGTITEL);
			//Aanvraag_Acties.aanvraagIntrekken(data.USERNAME, data.PASSWORD, data.AANVRAAGTITEL);
		
			
		}
		
		
		
}
