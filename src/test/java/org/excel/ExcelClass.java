package org.excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelClass extends BaseClass {
	@BeforeClass
	private void BeforeClass() {
        System.out.println("BeforeClass");
         }
	@AfterClass
	private void AfterClass() {
     System.out.println("AfterClass");
	}  
	@BeforeMethod
	private void BeforeMethod() {
        BrowserLaunch("chrome");
        ImplicitlyWait(10);
       System.out.println("BeforeMethod");
	}
    @AfterMethod
    private void AfterMethod() {
     System.out.println("AfterMrthod");
     quit();
	}
    @Test
    private void Test1() throws IOException, InterruptedException {
    	urlLaunch("https://facebook.com");
    	Thread.sleep(3000);
    	sendKeys(driver.findElement(By.id("email")), getExcelData("king", "facebook", 1, 0));
    	//sendKeys(e, Value);
    	System.out.println("Test........"+".........one");
    	System.out.println("ok facebook");
	}
    
    @Test(priority=1)
    private void Test2() {
    	urlLaunch("https://flipkart.com");
      System.out.println("Test2");
      System.out.println("ok flipkart");
	}
    @Test(enabled=true,priority=-1)
    private void Test3() {
      System.out.println("Test3");
      urlLaunch("https://www.king.com/");
      System.out.println("1"+"ok king");
	}
	  
	  
	  
	
	
	
	

}
