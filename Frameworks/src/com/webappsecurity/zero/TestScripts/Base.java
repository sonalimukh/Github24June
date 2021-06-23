package com.webappsecurity.zero.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	WebDriver driver;
	@BeforeTest
	public void openApplication() {
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		
		EdgeOptions capability = new EdgeOptions();
		
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		driver = new EdgeDriver(capability);
		
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	@AfterTest
	public void closeApplication() {
		driver.close();
		
	}

}
