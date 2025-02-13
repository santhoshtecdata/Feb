package vizza.mobileAppTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class du {

	 public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {

        // Appium server URL
        URL appiumServerURL = new URL("http://localhost:4723/");

        // Define capabilities in a W3C-compliant format
        HashMap capabilities = new HashMap<>();
        capabilities.put("platformName", "Android");
        capabilities.put("deviceName", "Infinix NOTE 30 5G");
        capabilities.put("platformVersion", "14");
        capabilities.put("appPackage", "com.gallery");
        capabilities.put("appActivity", "com.gallery.HomeActivity");
        capabilities.put("automationName", "UiAutomator2");
        capabilities.put("noReset", true);
 
      
        System.out.println("Session started");

        
        // Create W3C-compliant capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("firstMatch", new HashMap[] { capabilities });

        // Initialize the AndroidDriver with W3C capabilities
        driver = new AndroidDriver(appiumServerURL, desiredCapabilities);

        // Verify if session is created successfully
        System.out.println("Session created successfully!");
    }

	}

