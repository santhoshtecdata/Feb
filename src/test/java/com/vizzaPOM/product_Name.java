package com.vizzaPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driverManager.driverManager;


public class product_Name {
	
	private static product_Name getproductName ;
	
	public static product_Name getproductName() {
		
		
			getproductName= PageFactory.initElements(driverManager.getDriver(), product_Name.class);
		return getproductName;
	}
	
	
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-quote-calculation/div[2]/div/div[2]/div[1]/div[1]/div[1]/img")
	WebElement ICICI;
	
	public WebElement getICICI() {
		return ICICI;
	}
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-quote-calculation/div[2]/div/div[2]/div[2]/div[1]/div[1]/img")
	WebElement Royal_sundaram;
	
	public WebElement getRoyal_sundaram() {
		return Royal_sundaram;
	}
	
	@FindBy (xpath ="(//div[@class='pcc-details'])[5]")
	WebElement goDigit;

	public WebElement getGoDigit() {
		return goDigit;
	}
	
			@FindBy (xpath ="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-quote-calculation/div[2]/div/div[2]/div[5]/div[1]")
	WebElement universal;

	public WebElement getUniversal() {
		return universal;
	}
	
	@FindBy(xpath="(//button[@class='btn btn-outline-info'])[3]")
	WebElement chola ;
	 
	public WebElement getChola () {
		
		return chola; 
	}
}
