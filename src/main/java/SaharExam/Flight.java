package SaharExam;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flight {
	
	@Test
	 public void FlightTesting() {
	
		 
		 

	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      WebDriverWait wait =
              new WebDriverWait(driver, Duration.ofSeconds(30));

      WebDriverWait shortWait =
              new WebDriverWait(driver, Duration.ofSeconds(8));
      

	  

      try {

          driver.get("https://www.jetblue.com/");


    	  WebElement host = driver.findElement(
    			  By.cssSelector("div[id^='pop-frame']")
    	    	);
    	 
    	    	SearchContext shadowRoot = host.getShadowRoot();
    	 
    	    	WebElement acceptCookies = shadowRoot.findElement(
    	    			By.cssSelector("a.call"));
    	    	acceptCookies.click();


          WebElement from = wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.xpath(
                      "//label[normalize-space()='From']" +
                      "/preceding-sibling::input[@role='combobox'][1]"
                  )
              )
          );

          from.click();
          from.sendKeys("Mumbai");

          wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.xpath("//li[@value='BOM']")
              )
          ).click();

          System.out.println("From: Mumbai selected.");


     

          WebElement to = wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.xpath(
                      "//label[normalize-space()='To']" +
                      "/preceding-sibling::input[@role='combobox'][1]"
                  )
              )
          );

         to.click();
          to.sendKeys("London");

          wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.xpath("//li[@value='LHR']")
              )
          ).click();

          System.out.println("To: London selected.");


          

          WebElement departDate = wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.xpath(
                      "//label[normalize-space()='Depart']" +
                      "/preceding-sibling::input[1]"
                  )
              )
          );

        departDate.click();



          LocalDate today = LocalDate.now();

          LocalDate after2days = today.plusDays(2);

          int todayDay = today.getDayOfMonth();

          int after2Day = after2days.getDayOfMonth();

          System.out.println("Today: " + today);
          System.out.println("Return date: " + after2days);


         
          DateTimeFormatter formatter =
                  DateTimeFormatter.ofPattern("MMMM yyyy", Locale.ENGLISH);

          String departMonthYear =
                  today.format(formatter);

          String returnMonthYear =
                  after2days.format(formatter);

          System.out.println("Depart month: " + departMonthYear);
          System.out.println("Return month: " + returnMonthYear);


         

          By departDayLocator = By.xpath("//div[@data-month='true']" +"[.//div[normalize-space()='" +  departMonthYear +  "']]" +
              "//button[.//span[normalize-space()='" +
              todayDay +
              "']]"
          );

          WebElement departDay = wait.until(
              ExpectedConditions.elementToBeClickable(departDayLocator)
          );

          departDay.click();

          System.out.println("Depart date selected: " + today);


          

          WebElement returnInput = wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.xpath(
                      "//label[normalize-space()='Return']" +
                      "/preceding-sibling::input[1]"
                  )
              )
          );

        returnInput.click();


   

          By returnDayLocator = By.xpath(
              "//div[@data-month='true']" +
              "[.//div[normalize-space()='" +
              returnMonthYear +
              "']]" +
              "//button[.//span[normalize-space()='" +
              after2Day +
              "']]"
          );

          WebElement returnDay = wait.until(
              ExpectedConditions.elementToBeClickable(returnDayLocator)
          );

         returnDay.click();

          System.out.println("Return date selected: " + after2days);



          try {
              WebElement done = shortWait.until(
                  ExpectedConditions.elementToBeClickable(
                      By.xpath("//button[normalize-space()='Done']")
                  )
              );
              done.click();
              System.out.println("Calendar closed.");
          } catch (Exception e) {
              System.out.println("Calendar already closed.");
          }


        

          WebElement searchFlights = wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.xpath("//button[normalize-space()='Search flights']")
              )
          );

          searchFlights.click();

          System.out.println("Search flights clicked.");

      } finally {
         
          driver.quit();
      }
  }


}
