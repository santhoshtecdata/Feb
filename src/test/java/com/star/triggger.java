package com.star;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mainBase.vizzaBase;
import com.star.*;

public class triggger implements ITestListener {
   
    
	public void onTestStart(ITestResult result) {
		 System.out.println("Testing starting...");
	}
    @Override
    public void onTestSuccess(ITestResult result) {
       
    }

    @Override
    public void onTestFailure(ITestResult result) {
     System.out.println("failure");
     
     vizzaBase vizzaBase = new vizzaBase();
     TestStar1 ts = new TestStar1();
     EventFiringWebDriver ef = new EventFiringWebDriver(vizzaBase.driver);
		File f1 = ef.getScreenshotAs(OutputType.FILE);
		 System.out.println(ts.name);
		 
		File f2 = new File("C:\\Users\\Tec Data\\Pictures\\selenium\\"+ts.name+".png");
		try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			System.out.println("we can not take screenshot here");	
	
		}
    
     vizzaBase. driver.quit();
    }

  
 
	
	

}
