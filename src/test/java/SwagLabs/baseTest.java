package SwagLabs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTest {
	

	 protected  WebDriver driver;
	
		
	@BeforeTest
public void setup() {
	
	driver=  new ChromeDriver();
	
	String Url= "https://www.saucedemo.com/";
	
	driver.get(Url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
	@AfterTest
	public void closewindow() {
		
		if (driver!=null)
			
			driver.quit();
	}


}


