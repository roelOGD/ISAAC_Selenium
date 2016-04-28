package org.POM.data;
import org.testng.annotations.DataProvider;

public class ISAAC_Data {

		@DataProvider(name = "login")
		public static Object[][] login(){
			return new Object[][] {
				{"piet","Test16"}
			};
		}
}
