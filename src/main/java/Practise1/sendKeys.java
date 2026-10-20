package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class sendKeys {
	
		@Test
	public void sendKeysss() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		
		WebElement element= driver.findElement(By.id("user-name"));
		element.sendKeys("sahar");
		WebElement element1= driver.findElement(By.id("password"));
		element1.sendKeys("1234");
		//element1.sendKeys(Keys.RETURN);
		
		// driver.findElement(By.id("login-button")).sendKeys(Keys.RETURN);
		 
		// element.clear();
		 //element1.clear();
		 
		 
		
	}

}
