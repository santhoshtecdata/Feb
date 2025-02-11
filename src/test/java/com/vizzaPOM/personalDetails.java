package com.vizzaPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driverManager.driverManager;


public class personalDetails {
	private static personalDetails getpd =null;
	
	public static personalDetails getpd() {	
		
			 getpd = PageFactory.initElements(driverManager.getDriver(),personalDetails.class);
		
		return getpd;
		
	}
	

	
	@FindBy (xpath="//select[@formcontrolname='title']")
	WebElement tittle;

	@FindBy (xpath="//ngx-select-dropdown[@formcontrolname='city']")
	WebElement City;
	
	@FindBy (xpath="//ngx-select-dropdown[@formcontrolname='pincode']")
	WebElement picode;
	
	@FindBy (xpath="//select[@formcontrolname='occupation']")
	WebElement occupation;
	
	
	@FindBy (xpath="//div[@class='mat-checkbox-inner-container']")
	WebElement sameAsAbove;
	
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement submitBtn;


	public WebElement getTittle() {
		return tittle;
	}


	public WebElement getCity() {
		return City;
	}


	public WebElement getPicode() {
		return picode;
	}


	public WebElement getOccupation() {
		return occupation;
	}


	public WebElement getSameAsAbove() {
		return sameAsAbove;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getDOB() {
		return DOB;
	}


	public WebElement getAddress1() {
		return address1;
	}


	public WebElement getAddress2() {
		return address2;
	}


	public WebElement getPannumber() {
		return pannumber;
	}



	@FindBy (xpath="//input[@formcontrolname='firstName']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@formcontrolname='lastName']")
	WebElement lastName;
	
	
	@FindBy (xpath="//input[@formcontrolname='dateOfBirth']")
	WebElement DOB;
	
	
	@FindBy (xpath="//input[@formcontrolname='address1']")
	WebElement address1;
	
	
	@FindBy (xpath="//input[@formcontrolname='address2']")
	WebElement address2;
	
	
	@FindBy (xpath="//input[@formcontrolname='panNumber']")
	WebElement pannumber;
	
	
	
	
	
	
	
	
	
}
