package WebElementID;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementID {

	//public static void main(String[] args) {
	
	@Test
		public void webElemnettest() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.coursera.org/");
		driver.findElement(By.xpath("//input[@id='search-autocomplete-input']")).sendKeys("sahar");
		
		
		
		// driver.get("https://www.coursera.org/?authMode=login");
		
		// driver.findElement(By.id("cds-react-aria1866369611-:rl:")).sendKeys("testuser@example.com");
		 //driver.findElement(By.name("email")).sendKeys("sahar.dwikat@example.com");

     
		

	}

}
