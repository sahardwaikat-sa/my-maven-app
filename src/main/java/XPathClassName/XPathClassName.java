package XPathClassName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathClassName {
	
	 @Test
	public void  ClassName() {
		 
		 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath ("//input[@class='input_error form_input']")).click();
		
		
		//sendKeys("sahar");
		 
		 
	 }
	
	

}
