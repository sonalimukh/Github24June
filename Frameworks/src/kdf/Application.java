package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.GenericMethods;

public class Application {
// making changes to Application class
	@Test
	public void invalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("C:\\Users\\mukhe\\OneDrive\\Documents\\Selenium\\Spreadsheet.xlsx", "Sheet2");
		Methods mtm = new Methods()	;
		for(int i=1 ; i< data.length ; i++) {
			switch (data[i][3]) {
			case "openBrowser" :
			    mtm.openBrowser();
			    break;
			case "maxBrowser":
				mtm.maximizeBowserWindow();
				break;
			case "impWait":
				mtm.implementImplicitWait();
				break;
			case "navigateToAut":
				mtm.navigateToApplication(data[i][6]);
				break;
			case "enterInTextBox":
				mtm.EnterInTextbox(data[i][5], data[i][6]);
				break;
			case "clickButton":
				mtm.ClickButton(data[i][4],data[i][5]);
				break;
			case "verifyMsg":
				String actualMsg = mtm.getMessage(data[i][4],data[i][5]);
				String expectedMsg = data[i][6];
				Assert.assertEquals(actualMsg, expectedMsg);
				break;
			case "closeApp":
				mtm.closeApp();
				break;
			}
		}
		
	}
	
}
