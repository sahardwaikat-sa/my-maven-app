package SaharExam;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeTest;


public class SetupPage {
	
		WebDriver driver;
		WebDriverWait wait;
	
	@BeforeTest
	public void setup() {
	
			
	driver =new ChromeDriver();
	wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("https://automationexercise.com");
	
	}

}
