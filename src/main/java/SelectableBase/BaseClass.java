package SelectableBase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void setupTest() {
	
	driver = new ChromeDriver();
	
	driver.get(" https://demoqa.com/selectable");
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	
	//@AfterTest
	//public void close() {
		
		//if(driver!=null) {
			
		//	driver.quit();
	//}
	

//}
}


