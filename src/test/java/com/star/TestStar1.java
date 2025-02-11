package com.star;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


public class TestStar1 extends com.mainBase.vizzaBase {
	Faker fake=new Faker();
	public  String name=fake.name().firstName();
	
	@Test
	public void loginWithValidCredentials() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	options.addArguments("--incognito");
		driver.get(getProperty(incourl));
		driver .get("https://vizzainsurance.com/home");
		com.pomStar.login lg= PageFactory.initElements(driver,com.pomStar.login.class);
		lg.getLoginBtn().click();
		lg.getPosLink().click();
		lg.getMobileNumper().sendKeys("9962907312");
		lg.getPassword().sendKeys("admin1");
		lg.getSupmitBtn().click();
		Thread.sleep(3000);
		boolean loginHomePage=lg.getLogOutBtn().isDisplayed();
		Thread.sleep(3000);
		Assert.assertTrue(loginHomePage);
	}
	@Test
	public void premiumQuotePage() throws InterruptedException, IOException {
		
		com.pomStar.starQuotePage sq=PageFactory.initElements(driver,com.pomStar.starQuotePage.class);
		sq.getOnlineInsurance().click();
		sq.getHealthInsurance().click();
	
		Thread.sleep(1000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		sq.getAgeFiledforSelf().sendKeys("22");Thread.sleep(1000);
		scroll(14);
		Thread.sleep(2000);
		sq.getPincode().click();
		sq.getPincode().sendKeys("600001");
		driver.findElement(By.tagName("html")).click();
		sq.getProceedBtn().click();
		Assert.assertTrue(sq.getVerifiedPremiumQuotePage().isDisplayed());

	}

	@Test
	public void quote() throws InterruptedException, IOException {
	
		com.pomStar.quote q= PageFactory.initElements(driver,com.pomStar.quote.class);
		q.getFilter().click();Thread.sleep(1000);
		q.getStar().click();
		Thread.sleep(1000);
		q.getAssure().click();
		Thread.sleep(2000);
	}

	@Test
	public void proposerDetails() throws InterruptedException, IOException {
		
		com.pomStar.proposerDetails p= PageFactory.initElements(driver, com.pomStar.proposerDetails.class);
		Thread.sleep(2000);
		p.getTitle().click();Thread.sleep(2000);
		p.getMr().click();Thread.sleep(1000);
		
		p.getFirstName().sendKeys(name);
        char initial = name.charAt(2);
        p.getMitName().sendKeys(Character.toString(initial).toUpperCase());
		p.getLastName().sendKeys("TEST");
		p.getDOB().sendKeys("06/06/2002");
		p.getOccupation().click();
		p.getBusiness().click();
		p.getMail().sendKeys(fake.internet().emailAddress().replace("@.*", "@gmail.com"));
		p.getPhone().sendKeys("9"+fake.number().digits(9));
		scroll(7);
		p.getAddress1().sendKeys("36");scroll(4);
		p.getAddress2().sendKeys(fake.address().city());scroll(4);
		p.getPincode().sendKeys("600001");
		p.getCity().click();Thread.sleep(1000);
		p.getCity().click();
		p.getCityvalue().click();
		p.getArea().click();Thread.sleep(1000);
		p.getArea().click();
		p.getAreaValue().click();
		p.getSameusAddress().click();
		scroll(16);
		p.getNextBtn().click();
	}
	@Test
	public void ckyc() throws InterruptedException, AWTException, IOException {
		
		com.pomStar.ckyc c=PageFactory.initElements(driver, com.pomStar.ckyc.class);
		c.getCkycNO().click();
		c.getPanNumber().sendKeys("DIKPD3849H");
		scroll(6);
		c.getSubmitbtn().click();Thread.sleep(2000);
		
		c.getAddressProf().click();
		c.getAadhar().click();
		c.getAdharNum().sendKeys("3245");
		c.getDoc1().click();
        
		 
		file();

		c.getIdproof().click();
		c.getIdAadhar().click();
		c.getAadharNumber2().sendKeys("3245");
		c.getDoc2().click();
		
		

		file();

		scroll(3);Thread.sleep(2000);
		c.getDoc3().click();

		file();
		scroll(8);
		Thread.sleep(2000);

		c.getSubmitBtn().click();

	}
	public void file() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		String invoiceBill ="‪myaadhar.jpg";
		StringSelection str = new StringSelection(invoiceBill);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@Test
	public  void nom() throws InterruptedException, AWTException, IOException {
		
		com.pomStar.insuredPage i= PageFactory.initElements(driver, com.pomStar.insuredPage.class);
		Thread.sleep(2000);
		System.out.println("nominee page ckyc verifiyed successfully");
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		i.getSameUs().click();
		i.getHeight().sendKeys("165");
		i.getWeight().sendKeys("65");
		scroll(8);
		i.getInssubmitBtn().click();
		Thread.sleep(3000);
		i.getNomname().sendKeys("user");
		i.getAge().sendKeys("27");
		i.getRelaton().click();
		i.getBro().click();
		i.getPer().sendKeys("100");
		Thread.sleep(1000);
		i.getNomSubmitBtn().click();
	}

public  void comnom() throws InterruptedException, AWTException, IOException {
		
	com.pomStar.insuredPage i= PageFactory.initElements(driver,com.pomStar. insuredPage.class);
		Thread.sleep(2000);
		driver.findElement(By.tagName("html")).click();Thread.sleep(1000);
		i.getSameUs().click();
		i.getHeight().sendKeys("165");
		i.getWeight().sendKeys("65");
		scroll(8);
		i.getPersonalAccitent().click();
		scroll(5);
		i.getInssubmitBtn().click();
		Thread.sleep(3000);
		i.getNomname().sendKeys("user");
		i.getAge().sendKeys("27");
		i.getRelaton().click();
		i.getBro().click();
		i.getPer().sendKeys("100");
		Thread.sleep(1000);
		i.getNomSubmitBtn().click();
	}

public void comquote() throws InterruptedException, IOException {
	
	com.pomStar.quote q= PageFactory.initElements(driver,com.pomStar.quote.class);
	q.getFilter().click();Thread.sleep(1000);
	q.getStar().click();
	Thread.sleep(500);
	q.getCom().click();
	Thread.sleep(2000);
}


	@Test
	public void assure() throws InterruptedException, IOException, AWTException {
		TestStar1 ts = new TestStar1();
		ts.loginWithValidCredentials();
		ts.premiumQuotePage() ;
		ts. quote();
		ts.proposerDetails();
		ts.ckyc();
		ts.nom();
        	}
	@Test
	public void com() throws InterruptedException, IOException, AWTException {
		TestStar1 ts = new TestStar1();
		loginWithValidCredentials();
		ts.premiumQuotePage() ;
		ts. comquote();
		ts.proposerDetails();
		ts.ckyc();
		ts.comnom();
		
		
	}
	public void logout() {
		
		com.pomStar.proposerDetails p= PageFactory.initElements(driver, com.pomStar.proposerDetails.class);
		p.getLogOut().click();
	}
	
	public void copy() {
		com.pomStar.insuredPage i= PageFactory.initElements(driver,com.pomStar. insuredPage.class);
		driver.findElement(By.tagName("html")).click();
		Robot r1 = null;
		 try {
			 r1=new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		 r1.keyPress(KeyEvent.VK_ALT);
		scroll(60);
		r1.keyRelease(KeyEvent.VK_ALT);
		i.getCopyLink().click();
	}
	
}
