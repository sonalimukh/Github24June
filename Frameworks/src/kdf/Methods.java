package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Methods {
WebDriver driver;

public void openBrowser() {
	

driver = new EdgeDriver();

}

public void maximizeBowserWindow() {
	driver.manage().window().maximize();
}

public void implementImplicitWait() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
public void navigateToApplication(String url) {
	driver.get(url);
}

public void EnterInTextbox(String locValue , String testData) {
	driver.findElement(By.id(locValue)).sendKeys(testData);
}
public void ClickButton(String loc , String locValue) {
	if(loc.equals("name")) {
	driver.findElement(By.name(locValue)).click();
	}
	else if (loc.equals("xpath")) {
		driver.findElement(By.xpath(locValue)).click();
	}
}

public String getMessage(String loc , String locValue) {
	String errMsg = null;
	if (loc.equals("cssSelector")) {
	   errMsg =  driver.findElement(By.cssSelector(locValue)).getText();
	
	}
	else if (loc.equals("id")) {
		 errMsg =  driver.findElement(By.id(locValue)).getText();
	}
		return errMsg;
	
}
public void closeApp() {
	driver.close();
}


}
