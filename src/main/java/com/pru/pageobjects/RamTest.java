package com.pru.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RamTest {
	
	WebDriver driver;
	
	
	@BeforeClass
	//setup
	
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.manage().timeouts().implicitlyWait(0, null)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test
	public void Ramtest()
	{
		
		PageObjects pageobject = new PageObjects(driver);
		pageobject.abtesting();
		pageobject.addremoveelement();
		pageobject.BasicAuth();
		
	}
	
	@AfterClass
	void teardown ()
	{
		//driver.quit();
	}
	
	
	

}
