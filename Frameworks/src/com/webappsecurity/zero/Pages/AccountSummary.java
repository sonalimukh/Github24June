package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {
	
	public AccountSummary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Transfer Funds")
	private WebElement transferFunds;
	


	public boolean IsTransferFundsPresent() {
		return transferFunds.isDisplayed();
	}
	
	public void clickTransferFunds() {
		transferFunds.click();
	}

}