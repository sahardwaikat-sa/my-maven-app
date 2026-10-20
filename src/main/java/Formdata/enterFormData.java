package Formdata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class enterFormData {

    @DataProvider(name = "dataform")
    public Object[][] getdata() {

        return new Object[][] {
            {"sahar", "dwikat", "0599311989"}
        };
    }

    @Test(dataProvider = "dataform")
    public void dataForm(String Firstname, String lastname, String Phon) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(50));

        // First Name
        driver.findElement(By.id("firstName"))
                .sendKeys(Firstname);

        // Last Name
        driver.findElement(By.id("lastName"))
                .sendKeys(lastname);

        // Gender
        driver.findElement(
                By.xpath("//input[@id='gender-radio-2']")
        ).click();

        // Phone
        driver.findElement(By.id("userNumber"))
                .sendKeys(Phon);
    

        // Submit - ONLY ONCE
        WebElement submitButton =
                wait.until(ExpectedConditions.elementToBeClickable(
                        By.id("submit")
                ));
//----------------------------------------------------
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", submitButton);
        
        //----------------------------------------------------

        // Wait for success modal
        WebElement message =
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@class = 'modal-content']")
                ));

        // Verify
        Assert.assertTrue(
                message.getText().contains(
                        "Thanks for submitting the form"
                )
        );

        driver.quit();
}}
	


