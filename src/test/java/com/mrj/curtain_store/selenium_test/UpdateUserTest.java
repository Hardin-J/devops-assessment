package com.mrj.curtain_store.selenium_test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class UpdateUserTest {

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
	void validUpdateUser() throws InterruptedException {
		driver.get(url+"/updateUser/1");
		
//		WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Enter User Name']"));
//		uname.clear();
//		uname.sendKeys("Ponraj Marikanan");
//		
//		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your Email']"));
//		email.clear();
//		email.sendKeys("ponraj@rlz.com");
//		
//		WebElement gender =	driver.findElement(By.xpath("//input[@placeholder='Enter your Gender']"));
//		gender.clear();
//		gender.sendKeys("male");
//		
//		WebElement phnumber = driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']"));
//		phnumber.clear();
//		phnumber.sendKeys("8796541230");
//
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
//		Thread.sleep(300);
//		assertEquals("Data udpated Successfully", driver.switchTo().alert().getText());
	}
	
	@Test
	void missingPhNumberInUpdateUser() throws InterruptedException {
		driver.get(url+"/updateUser/1");
//		
//		WebElement phnumber = driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']"));
//		phnumber.clear();
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	
	@Test
	void missingGenderInUpdateUser() throws InterruptedException {
		driver.get(url+"/updateUser/1");
				
//		WebElement gender =	driver.findElement(By.xpath("//input[@placeholder='Enter your Gender']"));
//		gender.clear();
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	
	@Test
	void missingEmailInUpdateUser() throws InterruptedException {
		driver.get(url+"/updateUser/1");
		
//		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your Email']"));
//		email.clear();
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	
	@Test
	void missingUnameInUpdateUser() throws InterruptedException {
		driver.get(url+"/updateUser/1");
		
//		WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Enter User Name']"));
//		uname.clear();
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
//		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}

}
