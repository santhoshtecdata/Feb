package com.stepDifinitions;

import java.io.IOException;


import org.testng.Assert;

import com.constants.constant;
import com.driverManager.driverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import com.vizzaPOM.GCV;
import com.vizzaPOM.loginPOM;
import com.utility.*;


public class logInVizza {


	@Given("click the login option")
	public void click_the_login_option() throws IOException {
		driverManager.getDriver().get(constant.url);
	}
	@Given("enter the username")
	public void enter_the_username() {

		loginPOM.getGetins().getUserName().sendKeys(constant.username);
	}
	@When("enter the password")
	public void enter_the_password() {
		loginPOM.getGetins().getPassword().sendKeys(constant.password);
	}
	@When("click the login button")
	public void click_the_login_button() {
		utility.scroll(5);
		loginPOM.getGetins().getSupmitBtn().click();
	}
	@When("go to home page")
	public void go_to_home_page() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
        
		Assert.assertTrue(GCV.getgcv().getGcvHome().isDisplayed());
	}



}
