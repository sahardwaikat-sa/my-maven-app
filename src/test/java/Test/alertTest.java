package Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertTest {
	
	@Test
	public void checkBoxtest() throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement Button =driver.findElement(By.id("promtButton"));
		
	
		Button.click();
		
		
		Alert alert= driver.switchTo().alert();
		
		wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys("sahar");
		
		Assert.assertTrue(alert.getText().contains("Please enter your name"));
		
		alert.accept();
		
			
	
		
		

		
		
	        
			
		
	          
	          
		
		
		
		
		
	
	
	
	}
}

	
	
	
