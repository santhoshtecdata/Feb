package com.stepDifinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.constants.constant;
import com.driverManager.driverManager;
import com.utility.utility;
import com.vizzaPOM.GCV;
import com.vizzaPOM.loginPOM;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class logInMultipleUsers {
	
	

@Given("go to vizza portal")
public void go_to_vizza_portal() {
	driverManager.getDriver().get(constant.url);
}
@Given("enter the username and password")
public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	  List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);
	  for(int i=0;i<userDetails.size();i++) {
		  driverManager.getDriver().get(constant.url);
	String un=  userDetails.get(i).get("username");
	String pw=  userDetails.get(i).get("password");
	loginPOM.getGetins().getUserName().sendKeys(un);
	loginPOM.getGetins().getPassword().sendKeys(pw);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    


	utility.scroll(5);
	loginPOM.getGetins().getSupmitBtn().click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
	  }  
	

}

@When("verify the login")
public void verify_the_login() {
	
	
	Assert.assertTrue(GCV.getgcv().getGcvHome().isDisplayed());
}
}

