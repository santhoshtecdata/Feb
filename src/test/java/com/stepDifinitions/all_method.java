package com.stepDifinitions;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import com.constants.constant;
import com.driverManager.driverManager;
import com.utility.utility;
import com.vizzaPOM.GCV;
import com.vizzaPOM.loginPOM;
import com.vizzaPOM.personalDetails;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class all_method {


	@Given("login the vizza portal")
	public void login_the_vizza_portal() {
		driverManager.getDriver().get(constant.url);
		loginPOM.getGetins().getUserName().sendKeys(constant.username);
		loginPOM.getGetins().getPassword().sendKeys(constant.password);
		utility.scroll(5);
		loginPOM.getGetins().getSupmitBtn().click();
        
	}
	@Given("select the vehicle type")
	public void select_the_vehicle_type() throws InterruptedException {
		
	}
	@When("select the newbusiness in plan type {string}")
	public void select_the_newbusiness_in_plan_type(String string) {
		
		System.out.println(string);
		String type1= string;
		if(type1.equals("new")) {
			GCV.getgcv().getGcvHome().click();
			GCV.getgcv().getNewBussiness().click();
		}
		else {
			GCV.getgcv().getGcvHome().click();
			GCV.getgcv().getRollOver().click();
		}
	}

	
	@When("provide the valid inputs in basic details page")
	public void provide_the_valid_inputs_in_basic_details_page() throws InterruptedException {
		Thread.sleep(1000);
		GCV.getgcv();
		utility.list(GCV.getgcv().getCustomer(), "INDIVIDUAL");
		GCV.getgcv().getRegisterNumperState().sendKeys("AP");
		GCV.getgcv().getRegisternumper().sendKeys("05");
		utility.list(GCV.getgcv().getSubCategory(), "PUBLIC");
		GCV.getgcv().getCustomerName().sendKeys("test");
		GCV.getgcv().getPhoneNumper().sendKeys("9025939106");
		GCV.getgcv().getEmail().sendKeys("santhoshtest@gmail.com");
		utility.list(GCV.getgcv().getManufacturingYear(),"2024");
		GCV.getgcv().getMake().sendKeys(" BAXY");

		GCV.getgcv().getModel().click();
		utility.list(GCV.getgcv().getModel(),"SUPER KING");
		utility.list(GCV.getgcv().getMake(), "MAHINDRA");
		utility.list(GCV.getgcv().getModel(),"BOLERO");
		Actions ac = new Actions(driverManager.getDriver());
		ac.moveToElement(GCV.getgcv().getRegistrationDate()).perform();

		utility.list(GCV.getgcv().getSubModel(),"PICK UP FB");//1613  EX
		ac.moveToElement(GCV.getgcv().getAgreeCheckBox()).perform();
		utility.scroll(10);
		GCV.getgcv().getAddress1().sendKeys("kovil st");try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		GCV.getgcv().getAddress2().sendKeys("north street");
		try {
			utility.select(GCV.getgcv().getCity(),"MADURAI");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		try {
			utility.select(GCV.getgcv().getPincode(),"624202");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		GCV.getgcv().getAgreeCheckBox().click();
		GCV.getgcv().getSubmitBtn().click();
		Assert.assertTrue(GCV.getgcv().getPremiumQuotePage().isDisplayed());

		
	}
	@When("select the premium amount")
	public void select_the_premium_amount() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		try {
			selectProduct.selectProtect("chola");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	@When("verify the KYC details")
	public void verify_the_kyc_details() throws InterruptedException {
		
		Actions a = new  Actions(driverManager.getDriver());
		Thread.sleep(2000);
		
		utility.list(com.vizzaPOM.CKYC.getckyc().getIdType(),"PAN Card");
		Thread.sleep(2000);
		com.vizzaPOM.CKYC.getckyc().getPanNumber().sendKeys("PZEPS8945A");
		Thread.sleep(2000);utility.scroll(5);
		com.vizzaPOM.CKYC.getckyc().getName().sendKeys(" SAKTHILAKSHMI ANANTHAKRISHNAN");

		com.vizzaPOM.CKYC.getckyc().getGender().click();
		utility.list(com.vizzaPOM.CKYC.getckyc().getGender(),"FEMALE");
		a.moveToElement(com.vizzaPOM.CKYC.getckyc().getDob());
		com.vizzaPOM.CKYC.getckyc().getDob().click();
		com.vizzaPOM.CKYC.getckyc().getDob().sendKeys("16-02-2002");
		Thread.sleep(2000);


		//Thread.sleep(2000);

		a.moveToElement(com.vizzaPOM.CKYC.getckyc().getSaveBtn()).build().perform();
		com.vizzaPOM.CKYC.getckyc().getSaveBtn().click();
		Thread.sleep(2000);
		com.vizzaPOM.CKYC.getckyc().getPanVerified().click();
	}
	@Then("fill the personal details")
	public void fill_the_personal_details() throws InterruptedException {
		Thread.sleep(10000);
		utility.list(personalDetails.getpd().getTittle(),"MR");
		Thread.sleep(2000);
		 personalDetails.getpd().getFirstName().sendKeys("Santhosh");
		 personalDetails.getpd().getLastName().sendKeys("B");
		 personalDetails.getpd().getDOB().sendKeys("06/06/2002");
		 personalDetails.getpd().getAddress1().sendKeys("Test");
		 personalDetails.getpd().getAddress2().sendKeys("Test 2");
		Actions ac = new Actions(driverManager.getDriver());
		ac.moveToElement(personalDetails.getpd().getCity());
		personalDetails.getpd().getCity().sendKeys("CHENNAI");
		personalDetails.getpd().getPicode().sendKeys("600018");
		utility.scroll(10);
		utility.list(personalDetails.getpd().getOccupation(),"IT Profession");
		personalDetails.getpd().getPannumber().sendKeys("GLBPB9031Q");
		personalDetails.getpd().getSameAsAbove().click();
		personalDetails.getpd().getSubmitBtn().click();
	}
	@Then("fill the vechile details")
	public void fill_the_vechile_details() {
		
		utility.scroll(7);
		com.vizzaPOM.vehicle_details.getvd().getEngineNo().sendKeys("ENG1234567");
		com.vizzaPOM.vehicle_details.getvd().getChassicNo().sendKeys("CHA9876534");
		com.vizzaPOM.vehicle_details.getvd().getSaveBtn().click();
	}
	@Then("fill the nominee details")
	public void fill_the_nominee_details() {
		
		
		com.vizzaPOM.nomineePage.getnm().getNomineeName().sendKeys("TEST USER");
		com.vizzaPOM.nomineePage.getnm().getNomineeDOB().sendKeys("09/07/1975");
		utility.list(com.vizzaPOM.nomineePage.getnm().getRelation(),"FATHER");
		utility.scroll(7);
		com.vizzaPOM.nomineePage.getnm().getSaveBtn().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		com.vizzaPOM.nomineePage.getnm().getOkBtn().click();

	}
	@Then("proposal is created or not")
	public void proposal_is_created_or_not() {

	}



}
