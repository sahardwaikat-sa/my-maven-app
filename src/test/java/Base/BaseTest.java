package Base;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
public  WebDriver driver ;

@BeforeMethod
public void setupTest() {

driver=new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://the-internet.herokuapp.com");



}

//@AfterMethod
//public void close () {


   // if (driver!=null){


	
 //driver.quit();

//}

}//}
