package EnableDisable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class EnableDisable {
	
	public void  testing12() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		WebElement element1 = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		
		WebElement element2 = driver.findElement(By.xpath("//input[@type='text']"));
		
		element1.click();
		
		Thread.sleep(5000);
		
		System.out.println(element2.isEnabled());
		
		Thread.sleep(5000);
		
		element1.click();

		Thread.sleep(5000);
		
		System.out.println(element2.isEnabled());
		
		
		
		
		
	}

}
