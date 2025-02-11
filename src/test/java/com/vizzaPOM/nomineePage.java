package com.vizzaPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driverManager.driverManager;


public class nomineePage {
	private static nomineePage getnm = null;
	
	public static nomineePage getnm() {	
	
		
     getnm    = PageFactory.initElements(driverManager.getDriver(),nomineePage.class);
	return getnm;
	}
	
	
	@FindBy(xpath="//input[@formcontrolname='nominee_Name']")
    WebElement nomineeName;
	
	@FindBy(xpath="//input[@formcontrolname='nominee_DOB']")
    WebElement nomineeDOB;
	
	@FindBy(xpath="//select[@formcontrolname='nominee_Relationship']")
    WebElement relation;
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement saveBtn;

	
	@FindBy(xpath="//button[text()='Ok']")
    WebElement okBtn;
	
	public WebElement getOkBtn() {
		return okBtn;
	}

	public WebElement getNomineeName() {
		return nomineeName;
	}

	public WebElement getNomineeDOB() {
		return nomineeDOB;
	}

	public WebElement getRelation() {
		return relation;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
}
