package org.excel;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.*;

public class adactinHotel extends BaseClass {
	@BeforeClass
	private void BeforeClass() {
     System.out.println("beforeclass");
     BrowserLaunch("chrome");
    
     ImplicitlyWait(12);
	}
	@AfterClass
	private void AfterClass() {
     System.out.println("AFTERCLASS");
     quit();

	}
	@BeforeMethod
	private void BeforeMethod() {
    System.out.println("Before method");
	}
	@AfterMethod
	private void AfterMethod() {
    System.out.println("after method");
    System.out.println("Hotel done");
	}
	@Test
	private void Test() throws IOException {
		 urlLaunch("https://adactinhotelapp.com/");
     System.out.println("Test");
     Loginpage lp=new Loginpage();
     sendKeys(lp.getUsername(), getExcelData("king", "facebook", 1, 0));
     sendKeys(lp.getPassword(), getExcelData("king", "facebook", 1, 1));
     buttonClick(lp.getBtnclick());
     selectByIndex(lp.getHotel(), 2);
     selectByValue(lp.getLocation(), "Brisbane");
     selectByIndex(lp.getRoomType(), 3);
     selectByVisibleText(lp.getNumberOfRoom(), "3 - Three");
     selectByIndex(lp.getAdult(), 3);
     selectByIndex(lp.getChild(), 0);
     buttonClick(lp.getClickSearch());
     buttonClick(lp.getRadio());
     buttonClick(lp.getCountine());
     sendKeys(lp.getFullName(), getExcelData("king", "facebook", 1, 2));
     sendKeys(lp.getLastName(), getExcelData("king", "facebook", 1, 3));
     sendKeys(lp.getBillingAddress(), getExcelData("king", "facebook", 1, 4));
     sendKeys(lp.getCardNumber(), getExcelData("king", "facebook", 1, 5));
     selectByIndex(lp.getCardType(), 3);
     selectByValue(lp.getDate(), "5");
     selectByValue(lp.getYear(), "2022");
     sendKeys(lp.getCcvNumber(), getExcelData("king", "facebook", 1, 6));
     buttonClick(lp.getBookNow());
     String ord = getAttribute(lp.getOrderNumber());
      System.out.println(ord);
     }

	@Test
	private void Test2() {
    System.out.println("test2");
   urlLaunch("https://facebook.com");
	}
	

	
}
