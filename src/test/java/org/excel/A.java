package org.excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;

public class A extends BaseClass{
	
	
	@Test
	private void testA1() throws IOException {
		String g = getExcelData("king", "facebook", 1, 0);
		System.out.println(g);
		BrowserLaunch("chrome");
		urlLaunch("https://greens.com");
		System.out.println("excel done");
		
		driver.navigate().refresh();
		System.out.println("ok done");
		BrowserLaunch("chrome");
		

	}
	

}
