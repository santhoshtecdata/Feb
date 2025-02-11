package com.vizzaPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driverManager.driverManager;

public class loginPOM {

	private static loginPOM getins;
	

	public  static loginPOM getGetins() {
		getins= PageFactory.initElements(driverManager.getDriver(), loginPOM.class);
		return getins;
		
	}





	@FindBy(xpath="//b[text()='Commercial Vehicle']")
	 WebElement commercial_Vehicle;

	@FindBy(xpath="//input[@data-placeholder='Username']")
	 WebElement userName;

	@FindBy(xpath="//input[@data-placeholder='Password']")
	 WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	 WebElement supmitBtn;

	@FindBy(xpath="//span[text()='WELCOME']")
	 WebElement welCome;

	public WebElement getCommercial_Vehicle() {
		return commercial_Vehicle;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSupmitBtn() {
		return supmitBtn;
	}

	public WebElement getWelCome() {
		return welCome;
	}



}
