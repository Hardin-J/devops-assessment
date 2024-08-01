package com.mrj.curtain_store.selenium_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AddUserTest {
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
	void validAddUser() throws InterruptedException {
		driver.get(url+"/addUser");
//		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Ponraj");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys("ponraj@rlz.com");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Gender']")).sendKeys("male");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("8796541230");
//		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(300);
//		assertEquals("Data added Successfully", driver.switchTo().alert().getText());
	}
	
	@Test
	void missingUsername() throws InterruptedException {
		driver.get(url+"/addUser");
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys("ponraj@rlz.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your Gender']")).sendKeys("male");
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("8796541230");
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(300);
		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	@Test
	void missingEmail() throws InterruptedException {
		driver.get(url+"/addUser");
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Ponraj");		
		driver.findElement(By.xpath("//input[@placeholder='Enter your Gender']")).sendKeys("male");
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("8796541230");
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(300);
		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	@Test
	void missingGender() throws InterruptedException {
		driver.get(url+"/addUser");
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Ponraj");
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys("ponraj@rlz.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("8796541230");
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(300);
		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	@Test
	void missingPhoneNumber() throws InterruptedException {
		driver.get(url+"/addUser");
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Ponraj");
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys("ponraj@rlz.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your Gender']")).sendKeys("male");
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(300);
		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
}
