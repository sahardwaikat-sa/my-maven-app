package pressReturn;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pressReturn {
	@Test
	public void Test222(){
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	  driver.get("https://omayo.blogspot.com/");
	  
	  WebElement entertest= driver.findElement(By.xpath("//textarea[@id='ta1']"));
	  
	  entertest.sendKeys("hi saharrrrrrrrrrrrrrrrrr");
	  entertest.sendKeys(Keys.RETURN);
	  		
	  
	  
	}
}
