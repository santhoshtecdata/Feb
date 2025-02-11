package com.stepDifinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.constants.constant;
import com.driverManager.driverManager;
import com.utility.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class common {

	
	
	WebDriver driver =driverManager.getDriver();
	

	@Before(order=0)
	public void before() {
		utility util = new utility();
		
		
		try {
			util.property();
		} catch (IOException e) {

			e.printStackTrace();
		}
               
			
			driverManager.openBrowser();
			
		   
		   ChromeOptions options = new ChromeOptions();
		     options.addArguments("--disable-notifications");
		  driverManager.getDriver().manage().window().maximize();
		  driverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driverManager.getDriver().get(constant.url);
		  
		

		
	}
	
	

	@After(order=0)
	public void after() {
		driverManager.getDriver().quit();
		 
	}
	
	
	
}

		

			
		
		
	
	


