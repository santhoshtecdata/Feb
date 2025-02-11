package com.vizzaPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driverManager.driverManager;


public class CKYC {
	
	private static CKYC getckyc=null;
	
	public static CKYC getckyc() {
		
	
			getckyc= PageFactory.initElements(driverManager.getDriver(),CKYC.class);
			return getckyc;
	}
	
	@FindBy (xpath="//select[@formcontrolname='idtype']")
	WebElement idType;//PAN Card
	
	@FindBy (xpath="//input[@formcontrolname='idtypevalue']")
	WebElement panNumber;
	
	@FindBy (xpath="//input[@formcontrolname='fullname']")
	WebElement name;
	
	@FindBy (xpath="(//select[@formcontrolname='gender'])[2]")
	WebElement gender;//MALE
	
	@FindBy (xpath="(//input[@formcontrolname='dob'])[2]")
	WebElement dob;
	
	@FindBy (xpath="//span[text()='Next']")
	WebElement saveBtn;

	
	
	public WebElement getIdType() {
		return idType;
	}

	public WebElement getPanNumber() {
		return panNumber;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	@FindBy (xpath="//button[@class='btn btn-outline-info col-md-12'][text()='Ok']")
	WebElement panVerified;



	public WebElement getPanVerified() {
		return panVerified;
	}

}
