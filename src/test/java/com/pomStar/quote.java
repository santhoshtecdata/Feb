package com.pomStar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class quote {



	@FindBy(xpath="(//span[text()=' (+5 others) '])[1]")
	WebElement filter;

	@FindBy(xpath="(//span[text()='5 Lac'])[1]")
	WebElement sum;

	@FindBy(xpath="(//span[text()='Yearly'])[1]")
	WebElement mode;

	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/mat-option[3]/mat-pseudo-checkbox")
	WebElement star;

	@FindBy(xpath="(//span[text()='/Yr'])[1]")
	WebElement assure;


	@FindBy(xpath="/html/body/app-root/app-page/div/mat-sidenav-container/mat-sidenav-content/div[1]/app-health-insurance/div[1]/div/div[3]/div/div[1]/div[4]/div/button/span[2]")
	WebElement com;

	public WebElement getCom() {
		return com;
	}

	public WebElement getAssure() {
		return assure;
	}

	public void setAssure(WebElement assure) {
		this.assure = assure;
	}

	public WebElement getFilter() {
		return filter;
	}

	public void setFilter(WebElement filter) {
		this.filter = filter;
	}

	public WebElement getSum() {
		return sum;
	}

	public void setSum(WebElement sum) {
		this.sum = sum;
	}

	public WebElement getMode() {
		return mode;
	}

	public void setMode(WebElement mode) {
		this.mode = mode;
	}

	public WebElement getStar() {
		return star;
	}

	public void setStar(WebElement star) {
		this.star = star;
	}



}
