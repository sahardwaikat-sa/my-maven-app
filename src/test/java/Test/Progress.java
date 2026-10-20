package Test;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Progress {
	
	
	@Test
	public void verifyprogress() {
		
		WebDriver driver;
		WebDriverWait wait;
		
		driver =new ChromeDriver();
		wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		   driver.get("https://demoqa.com/progress-bar");
		   
		   By start = By.xpath("//button[@id='startStopButton']");
		   By progress = By.xpath("//div[@style='width: 44%;']");
		   By Stop = By .xpath("//button[text()='Stop']");
		   
		 driver.findElement(start).click();
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(progress));
		 
		 driver.findElement(Stop).click();
		 
		  
		
		
		  
		  
		  
		  
		  
		   
		   
		
	
		
	}
}
