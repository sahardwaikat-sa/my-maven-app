package NameLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameLocator {
	
	
	 @Test
	public void  Nameloc() {
			 			 
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.saucedemo.com/");
						
			WebElement driver1= driver.findElement(By.xpath ("//input[@name='user-name']"));
			
			driver1.click();
			//driver1.sendKeys("sahar");
			
			
			
			
			 

}}
