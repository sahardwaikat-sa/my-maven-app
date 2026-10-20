package sahar.selenium.testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiSelenium {

	public static void main(String[] args) {

		 //setup chrome driver
        WebDriverManager.chromedriver().setup();
        
        //instantiation of driver
        WebDriver driver = new ChromeDriver();
        //Launch website
        driver.get("https://www.google.com/");
                //Close browser
       
    }


	}



