package com.vizzaPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driverManager.driverManager;


public class vehicle_details {
	
	private static vehicle_details vd = null;
	
	public static vehicle_details getvd() {
	 vd = PageFactory.initElements(driverManager.getDriver(), vehicle_details.class);
	return vd;
	}
	
	
	@FindBy(xpath="//input[@formcontrolname='engine_Number']")
	WebElement engineNo;
	
	@FindBy(xpath="//input[@formcontrolname='chassis_Number']")
	WebElement chassicNo;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveBtn;
	
	@FindBy (xpath="//input[@formcontrolname='previous_Policy_Number']")
	WebElement priviousInsurerName;

	public WebElement getPriviousInsurerName() {
		return priviousInsurerName;
	}

	public void setPriviousInsurerName(WebElement priviousInsurerName) {
		this.priviousInsurerName = priviousInsurerName;
	}

	public WebElement getEngineNo() {
		return engineNo;
	}

	public WebElement getChassicNo() {
		return chassicNo;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

}
