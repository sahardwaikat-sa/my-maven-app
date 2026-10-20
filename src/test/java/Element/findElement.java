package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElement {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement Username = driver.findElement(By.name ("username"));

		WebElement Password = driver.findElement(By.id ("password"));
		
		 Username.sendKeys("Sahar");
		 Password.sendKeys("123");
		
		
		

	}

}
