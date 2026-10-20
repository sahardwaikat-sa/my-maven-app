package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Progress {
	
	@Test
	public void checkBoxtest() throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement red=driver.findElement(By.xpath("//input[@name='color' and @value='red']"));
		
		Thread.sleep(2000);
		red.click();
		
		boolean result = red.isSelected();
		
		Assert.assertTrue(result);
		
		System.out.println(result );
		
		Thread.sleep(2000);
					
			red.click();
			
		Assert.assertFalse(red.isSelected());
		
		
		
		
		
	}
	

}
