package com.mrj.curtain_store.selenium_test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	WebDriver driver;
	String url = "http://localhost:3000";

	@BeforeEach
	void setUp() {
		driver = new ChromeDriver();
	}
	
	@AfterEach
	void tearDown() {
		driver.quit();
	}	

	@Test
	@Order(1)
	void validLogin() {
		driver.get(url);
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Username']")).sendKeys("jeeva");
//		driver.findElement(By.xpath("//input[@id='pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.xpath("//button[normalize-space()='login']")).click();
	}
	
	@Test
	@Order(2)
	void inValidLogin() throws InterruptedException {
		driver.get(url);
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Username']")).sendKeys("mr-j");
//		driver.findElement(By.xpath("//input[@id='pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.xpath("//button[normalize-space()='login']")).click();
//		Thread.sleep(500);
//		assertEquals("Invalid Credentials", driver.switchTo().alert().getText());
	}
}
