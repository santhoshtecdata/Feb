package com.Base;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {

	 public static ChromeDriver driver;
	@Before
	public void launch() {
		System.setProperty("webdriver.driver.chrome", "E:\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://motoruat.vizzainsurance.com/");

	}
	@After
	public void teardown() {
		driver.quit();
	}
}
