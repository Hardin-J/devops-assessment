package com.mrj.curtain_store.selenium_test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RegisterTest {
	
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
	void validRegister() {
		driver.get(url+"/signup");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Jeevarajan");
//		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("jeeva@gmail.com");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Username']")).sendKeys("jeeva");
//		driver.findElement(By.xpath("//input[@name='pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.xpath("//input[@name='cs-pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.cssSelector("button[role='signUpBtn']")).click();
	}
	
	@Test
	void missingRegisterName() throws InterruptedException {
		driver.get(url+"/signup");
//		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("jeeva@gmail.com");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Username']")).sendKeys("jeeva");
//		driver.findElement(By.xpath("//input[@name='pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.xpath("//input[@name='cs-pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.cssSelector("button[role='signUpBtn']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	@Test
	void missingRegisterEmail() throws InterruptedException {
		driver.get(url+"/signup");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Jeevarajan");		
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Username']")).sendKeys("jeeva");
//		driver.findElement(By.xpath("//input[@name='pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.xpath("//input[@name='cs-pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.cssSelector("button[role='signUpBtn']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	@Test
	void missingRegisterUsername() throws InterruptedException {
		driver.get(url+"/signup");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Jeevarajan");
//		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("jeeva@gmail.com");
//		driver.findElement(By.xpath("//input[@name='pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.xpath("//input[@name='cs-pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.cssSelector("button[role='signUpBtn']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	@Test
	void missingRegisterPassword() throws InterruptedException {
		driver.get(url+"/signup");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Jeevarajan");
//		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("jeeva@gmail.com");
//		driver.findElement(By.xpath("//input[@name='cs-pswd']")).sendKeys("jeeva@123");
//		driver.findElement(By.cssSelector("button[role='signUpBtn']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}

}
