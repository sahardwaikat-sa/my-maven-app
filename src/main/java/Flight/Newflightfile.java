package Flight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newflightfile {

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

          

            handleCookieBanner(driver);


           

            WebElement from = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath(
                        "//label[normalize-space()='From']" +
                        "/preceding-sibling::input[@role='combobox'][1]"
                    )
                )
            );

            clickGuard(driver, from);
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

            clickGuard(driver, to);
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

            clickGuard(driver, departDate);


          

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

            clickGuard(driver, departDay);

            System.out.println("Depart date selected: " + today);



            WebElement returnInput = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath(
                        "//label[normalize-space()='Return']" +
                        "/preceding-sibling::input[1]"
                    )
                )
            );

            clickGuard(driver, returnInput);


           

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

            clickGuard(driver, returnDay);

            System.out.println("Return date selected: " + after2days);


           

            try {
                WebElement done = shortWait.until(
                    ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Done']")
                    )
                );
                clickGuard(driver, done);
                System.out.println("Calendar closed.");
            } catch (Exception e) {
                System.out.println("Calendar already closed.");
            }


            

            WebElement searchFlights = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Search flights']")
                )
            );

            clickGuard(driver, searchFlights);

            System.out.println("Search flights clicked.");
            
            Assert.assertTrue(driver.getCurrentUrl().contains("booking"));

        } finally {
            
            driver.quit();
        }
        
        
        
        
    }
    
    
    


   
    
    private void handleCookieBanner(WebDriver driver) {

        boolean bannerPresent;
        try {
            bannerPresent = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(d ->
                    !d.findElements(By.cssSelector(".truste_popframe")).isEmpty()
                    ||
                    !d.findElements(By.cssSelector(".truste_overlay")).isEmpty()
                );
        } catch (Exception e) {
            System.out.println("Cookie popup not shown, continuing...");
            return;
        }

        if (!Boolean.TRUE.equals(bannerPresent)) {
            System.out.println("Cookie popup not shown, continuing...");
            return;
        }

       
        try {
            WebElement host =
                    driver.findElement(By.cssSelector(".truste_popframe"));

            WebElement accept = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(d -> {
                    try {
                        for (WebElement a : host.getShadowRoot()
                                                .findElements(By.cssSelector("a"))) {
                            String text = a.getText() == null
                                    ? "" : a.getText().toLowerCase(Locale.ENGLISH);
                            if (text.contains("accept all cookies")) {
                                return a;
                            }
                        }
                    } catch (Exception ignored) {
                      
                    }
                    return null;
                });

            accept.click();
            System.out.println("Cookies accepted");

        } catch (Exception e) {
            System.out.println(
                "Could not click the Accept link ("
                + e.getClass().getSimpleName() + ")"
            );
        }

       
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5)).until(d ->
                d.findElements(By.cssSelector(".truste_overlay")).isEmpty()
            );
            System.out.println("Cookie overlay removed.");
        } catch (Exception e) {
            removeBannerNodes(driver);
            System.out.println("Cookie overlay force-removed via JavaScript.");
        }
    }


    
    private void removeBannerNodes(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript(
            "var nodes = document.querySelectorAll(" +
            "'.truste_overlay, .truste_popframe, " +
            "[id^=pop-div], [id^=pop-frame]');" +
            "for (var i = 0; i < nodes.length; i++) { nodes[i].remove(); }"
        );
    }


   
     
    private void clickGuard(WebDriver driver, WebElement element) {
        try {
            element.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println(
                "Click intercepted - clearing cookie banner and retrying..."
            );
            removeBannerNodes(driver);
            try {
                Thread.sleep(300);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            element.click();
        }
    }
}
