package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebDriver {
	
	@Test
	public void startUp() {
		//WebDriverManager Setup
		//WebDriverManager.chromedriver().setup();
		
		
		// Traditional way
		
		System.setProperty("webdriver.chrome.driver", "./browserDrivers/chromedriver.exe")
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
	}
	

}
