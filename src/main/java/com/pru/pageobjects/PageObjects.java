package com.pru.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	
	//Constructor
	WebDriver driver;
		
		public PageObjects(WebDriver driver) {
		this.driver=driver;
		
	}
		
	//Locators
		
		By abtesting_loc = By.linkText("A/B Testing");
		By addremoveele_home_loc = By.linkText("Add/Remove Elements");
		By addremoveele_loc = By.xpath("/html/body/div[@class='row']/div[@id='content' and contains(@class, 'large-12') and contains(@class, 'columns')]/div[@class='example']/button\r\n"
				+ "");
		
		By remove_loc = By.xpath("//button[@class='added-manually']");
		By BasicAuth_loc = By.linkText("Basic Auth");
		
		
		//By abtesting_loc = By.linkText("A/B Testing");
		//By abtesting_loc = By.linkText("A/B Testing");
		//By abtesting_loc = By.linkText("A/B Testing");
		
		
	//Action Methods
		public void abtesting()
		{
			driver.findElement(abtesting_loc).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			// Navigate back to homepage
			driver.navigate().back();
		}
		
		
		public void addremoveelement()
		{
			driver.findElement(addremoveele_home_loc).click();
			driver.findElement(addremoveele_loc).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(remove_loc).click();
	
			// Navigate back to Google
			driver.navigate().back();
		}
		
		public void BasicAuth()
		{
			driver.findElement(BasicAuth_loc).click();
			//This is a Browser Authentication Popup (specifically, HTTP Basic Authentication).
			//so alert won't work
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			//Alert alert = driver.switchTo().alert();
			//alert.sendKeys("admin");  // only if input fields exist
			//alert.sendKeys("admin");  // only if input fields exist
			//alert.accept();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.navigate().back();
			driver.navigate().back();
			
		}
		
		
		
				
}
