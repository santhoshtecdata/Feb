package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.constants.constant;
import com.driverManager.driverManager;
import com.vizzaPOM.loginPOM;





public class utility {

	public  void property() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Tec Data\\eclipse-workspace\\com.tecdata\\src\\test\\resources\\property.properties");
		Properties pro =  new Properties();
		try {
			pro.load(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}	

		constant.url=	pro.getProperty("url");
		constant.username=	pro.getProperty("username");
		constant.password=	pro.getProperty("password");



	} 

	public static  void init() {
		PageFactory.initElements(driverManager.getDriver(),loginPOM.class);
	}
	public static void list( WebElement ele,String text) {
		Select s= new Select(ele);
		s.selectByVisibleText(text);

	}
	public static void scroll(int no) {
		for(int i = 0;i<=no;++i) {
			driverManager.getDriver().findElement(By.xpath("html")) .sendKeys(Keys.ARROW_DOWN);
		}

	}
	 public static void select(WebElement w ,String value) throws InterruptedException {
		 w.click();
		 WebElement search =driverManager.getDriver().findElement(By.xpath("//input[@name='search-text']"));
		 search.click();
		 Thread.sleep(1000);
		 search.sendKeys(value);
		 driverManager.getDriver().findElement(By.xpath("//ul[@class='available-items']/child::li")).click();
		 
	 }

}
