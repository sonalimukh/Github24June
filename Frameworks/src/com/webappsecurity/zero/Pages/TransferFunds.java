package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	
public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(id = "tf_fromAccountId")
private WebElement fromAccount;

@FindBy(id = "tf_toAccountId")
private WebElement toAccount;

@FindBy(id = "tf_amount")
private WebElement Amt;

@FindBy(id = "tf_description")
private WebElement desc;

@FindBy(id = "btn_submit")
private WebElement continueBtn;

public void doFundsTransfer(String Amount , String Description) {
	Select fromdd = new Select(fromAccount);
	fromdd.selectByIndex(2);
	
	Select todd = new Select (toAccount);
	todd.selectByIndex(3);
	
	Amt.sendKeys(Amount);
	
	desc.sendKeys(Description);
	
	continueBtn.click();
	
}
	
	}
	

