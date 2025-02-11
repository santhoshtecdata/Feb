package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class logInPom {
	
	private static logInPom logInInstance ;
	
	private logInPom() {
		
	}
        public static logInPom getIn() {
        	
        	if (logInInstance == null) {
        		logInInstance = new logInPom();
        	}
			return logInInstance ;
        	
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
