package com.pomStar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class insuredPage {
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/div/mat-expansion-panel/div/div/div/div[1]/mat-checkbox/label/div")
	WebElement sameUs;
	
	@FindBy(xpath="(//input[@data-placeholder='Height(cms)'])[1]")
	WebElement height;
	
	@FindBy(xpath="(//input[@data-placeholder='Weight(kgs)'])[1]")
	WebElement weight;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement inssubmitBtn;
	
	@FindBy(xpath="//input[@id='mat-input-60']")
	WebElement nomname;
	
	@FindBy(xpath="//input[@id='mat-input-61']")
	WebElement age;
	
	@FindBy(xpath="//input[@id='mat-input-62']")
	WebElement per;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	WebElement nomSubmitBtn;
	
	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[3]/mat-accordion/mat-expansion-panel/div/div/div/div/div[1]/mat-card/div/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement relaton;
	
	@FindBy(xpath="//span[text()=' Brother ']")
	WebElement bro;

	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-star-health-proposal/section[1]/div/div/div[1]/mat-horizontal-stepper/div[2]/div[2]/mat-accordion/div/mat-expansion-panel/div/div/div/div[2]/div[10]/mat-radio-group/mat-radio-button[1]/label/div[2]")
	WebElement personalAccitent;
	
	@FindBy (xpath="//span[text()='Copy Link']")
	WebElement copylink;
	
	public WebElement getCopyLink() {
		return copylink;
	}
	
	public WebElement getPersonalAccitent() {
		return personalAccitent;
	}

	public void setPersonalAccitent(WebElement personalAccitent) {
		this.personalAccitent = personalAccitent;
	}

	public WebElement getSameUs() {
		return sameUs;
	}

	public WebElement getHeight() {
		return height;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getInssubmitBtn() {
		return inssubmitBtn;
	}

	public WebElement getNomname() {
		return nomname;
	}

	public WebElement getAge() {
		return age;
	}

	public WebElement getPer() {
		return per;
	}

	public WebElement getNomSubmitBtn() {
		return nomSubmitBtn;
	}

	public WebElement getRelaton() {
		return relaton;
	}

	public WebElement getBro() {
		return bro;
	}
	
	

}
