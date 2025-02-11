package com.stepDifinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driverManager.driverManager;
import com.utility.utility;
import com.vizzaPOM.product_Name;



public class selectProduct {



	public static void selectProtect(String CompanyName) throws InterruptedException{

		Actions ac = new Actions(driverManager.getDriver());
		String companyName = CompanyName;




		if("ICICI".equals(companyName)) {

			ac.moveToElement( product_Name.getproductName().getICICI()).click();
			System.out.println("ICICI");
		}
		else if("NewIndia".equals(companyName)) {
			System.out.println("New India"); 
		}
		else  if("GoDigit".equals(companyName)) {
			for(int i = 0;i<=10;++i) {
				driverManager.getDriver().findElement(By.xpath("html")) .sendKeys(Keys.ARROW_DOWN);
			}

			ac.moveToElement( product_Name.getproductName().getGoDigit()).click(); 


			WebElement amount  =driverManager.getDriver().findElement(By.xpath("//button[@class='btn btn-outline-info']/parent::div"));
			Thread.sleep(2000); for(int i = 0;i<=10;++i) {
				driverManager.getDriver().findElement(By.xpath("html")) .sendKeys(Keys.ARROW_DOWN);
			}
			amount.click();
			System.out.println("GoDigit");	

		}

		else if("chola".equals(companyName)) {
			System.out.println("CHOLAA"); 
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driverManager.getDriver(),10);
			wait.until(ExpectedConditions.elementToBeClickable(product_Name.getproductName().getChola()));
			product_Name.getproductName().getChola().click();
			System.out.println("CHOLAA end"); 
		}
		else if("UniversalSompo".equals(companyName)) {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driverManager.getDriver(), 30);

			wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
			utility.scroll(10);
			ac.moveToElement(product_Name.getproductName().getUniversal()).build().perform();
			System.out.println("Universal shampo start"); 
			Thread.sleep(2000); 
			driverManager.getDriver().findElement(By.xpath("//div[@class='pcc-details']//parent::button[@class='btn btn-outline-info']")).click();
			System.out.println("Universal shampo end");
			
		}
		else if ("RSA".equals(companyName)) {
			utility.scroll(9);
			// ac.moveToElement(pn.getRoyal_sundaram()).build().perform();
			Thread.sleep(2000);
			driverManager.getDriver().findElement(By.xpath("//button[@class='btn btn-outline-info']")).click();

		}
	}

}
