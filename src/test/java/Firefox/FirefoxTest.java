package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

	public static void main(String[] args) 
	
	{
		WebDriverManager.firefoxdriver().setup();
		
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.javapoint.com");
		 System.out.println("the page name "+ driver.getTitle());
		 
				 
		 driver.close();
	
		}

}
