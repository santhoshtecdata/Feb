package com.appTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class appTest {
	
	public static AppiumDriver driver;

	public static void main(String [] args) throws MalformedURLException {
		h();
	//	openMobileapp();
		
		
	}

	public static void openMobileapp() throws MalformedURLException {
		 
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName","Infinix NOTE 30 5G");
		cap.setCapability("udid","11215313CC121874");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformName","14");
		cap.setCapability("automationName","UiAutomator2");
		cap.setCapability("appPackage","com.gallery");
		cap.setCapability("appActivity","com.gallery.HomeActivity");
		
		URL u = new URL(" http://127.0.0.1:4723/");
			
		driver = new AppiumDriver(u,cap);
		System.out.println("sa victroy"); 
	
	}
	
	public static  void h() throws MalformedURLException {
	    // Create a new instance of DesiredCapabilities
        DesiredCapabilities cap = new DesiredCapabilities();

        // Set device and platform capabilities
        cap.setCapability("deviceName", "Infinix NOTE 30 5G");  // Device name
        cap.setCapability("udid", "11215313CC121874");          // UDID of your device
        cap.setCapability("platformName", "Android");           // Platform name
        cap.setCapability("platformVersion", "14");             // Platform version, correct capability
        cap.setCapability("automationName", "UiAutomator2");    // Automation engine

        // Set app-specific capabilities
        cap.setCapability("appPackage", "com.gallery");         // App package name
        cap.setCapability("appActivity", "com.gallery.HomeActivity"); // Main app activity

        // Appium Server URL (ensure no spaces in the URL)
        URL u = new URL("http://127.0.0.1:4723/");

        // Initialize the driver with the server URL and capabilities
        AndroidDriver driver = new AndroidDriver(u, cap);

        // Your test code here

        // Quit the driver session
        driver.quit();
        
    }
	
    

}
