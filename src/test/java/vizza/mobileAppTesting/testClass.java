package vizza.mobileAppTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class testClass {	

	public static AppiumDriver drivere;
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		//	h();
		//   f();


		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName", "Android");             
		caps.setCapability("deviceName", "Infinix NOTE 30 5G");          
		caps.setCapability("platformVersion", "14");  

		caps.setCapability("udid", "11215313CC121874");        
		caps.setCapability("appPackage", "com.spotify.music");        
		caps.setCapability("appActivity", "com.spotify.music.MainActivity");
		caps.setCapability("automationName", "UiAutomator2");       // Automation engine (UiAutomator2 for Android)
		caps.setCapability("noReset", true); 


         
		  URL url = new URL(" http://0.0.0.0:4723/");
		AndroidDriver drivere =new AndroidDriver(url,caps);
		// driver= new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

		System.out.println("jsnc");
	}

}


