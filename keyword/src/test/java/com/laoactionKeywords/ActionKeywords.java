package com.laoactionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	static WebDriver driver;
	//openbrowser
	public static void openBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Desktop\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		
	}
	//goto URL
	public static void goToUrl() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		
	}
	//Enter usernmae
	public static void enterUsername() {
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		userName.sendKeys("Admin");
		
		
		
	}
	//Enter password
	public static void enterPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("admin123");
		
	}
	//click on login button
	public static  void clickOnLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginButton.click();
		
	}
}
