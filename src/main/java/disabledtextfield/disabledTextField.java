package disabledtextfield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class disabledTextField {
	
	
	@Test
	public void redText() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement element = driver.findElement(By.xpath ("//button[@id='but1']"));
		
		System.out.println(element.getText());
		
	}
	
	
	}


