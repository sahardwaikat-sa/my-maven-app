package listListP;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class saharlist {

    @Test
    public void testAlert() {
        // Setup Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the Chrome browser window
        driver.manage().window().maximize();

        // Store the home page URL in a variable
        String URL = "https://jqueryui.com/menu/";

        // Navigate to the URL
        driver.get(URL);

        // Switch to the frame containing the menu
       // WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Find all menu items (each menu item is an <li> element under <ul id="menu">)
        List<WebElement> menuItems = driver.findElements(By.xpath("//*[@id='menu']/li"));

        // Extract text from menu items and store in a list
        List<String> actualMenu = new ArrayList<>();
        for (WebElement menuItem : menuItems) {
        	       	
           actualMenu.add(menuItem.getText());
        }
        
            

        // Assert the number of menu items is 7
        Assert.assertEquals(menuItems.size(), 7, "Mismatch in number of menu items");

        // Print the actual menu items to the console
       System.out.println(actualMenu);

        // Quit the WebDriver to close the browser
        driver.quit();
    }


	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	


