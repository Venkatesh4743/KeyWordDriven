package com.lao.test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Testcase01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Desktop\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[placeholder='Username']")));
        userName.sendKeys("Admin");

        
        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        password.sendKeys("admin123");

        // Wait until the login button is present
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        loginButton.click();

        

     
        
    }
}
