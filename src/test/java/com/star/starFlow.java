package com.star;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;





public class starFlow extends com.mainBase.vizzaBase{
	@Test
	
	public void makePolicy() throws InterruptedException, IOException, AWTException {
		test = report.createTest("verify proposal is created or not");
		test.pass("chrome browser opened");
		test.pass("login successfully");
		TestStar1 ts = new TestStar1();
		ts.assure() ;
		test.pass("Assure product proposal is created");
		until(30);
		ts.copy();
		driver.get("https://vizzainsurance.com/home");
		until(3);
		ts.logout();until(2);
		test.pass("logout successfully");
		ts.com();
		test.pass("Comprehensive product proposal is created");
		until(10);
		ts.copy();
		test.pass("star produts verifiyed");
		
	}
	
	/*public static void report() {
		
		//create a empty html file
				ExtentSparkReporter esr = new ExtentSparkReporter("./testReport.html");
				//Actual report generate this
				ExtentReports report = new ExtentReports();
				// attach the report and file
				report.attachReporter(esr);
		
		ExtentTest test = report.createTest("test case 1");
		test.pass("click the button");
		test.pass("success");
		
		report.flush();
		pri("done");
		
	}
	
	
	@Test
	public void du() {
		driver.get("https://practice.expandtesting.com/upload");
		until(2);
		scroll(5);
		driver.findElement(By.xpath("/html/body/main/div[3]/div/div[1]/div/form/div/input")).sendKeys("C:\\Users\\Tec Data\\Videos\\myaadhar.jpg");
	}
	*/
}


