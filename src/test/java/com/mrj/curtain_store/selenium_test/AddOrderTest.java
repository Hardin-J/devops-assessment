package com.mrj.curtain_store.selenium_test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AddOrderTest {
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
	void validAddOrder() {
		driver.get(url+"/addOrder");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Cotton");
//		driver.findElement(By.xpath("//input[@placeholder='Enter quantity']")).sendKeys("5");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your price']")).sendKeys("5000");
//		{
//			WebElement dropdown = driver.findElement(By.xpath("//select[@name='selectedId']"));
//			dropdown.findElement(By.xpath("//option[.='2']")).click();
//		}
//		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	}
	
	@Test
	void missingFieldsInOrderMaterialName() throws InterruptedException {
		driver.get(url+"/addOrder");
//		driver.findElement(By.xpath("//input[@placeholder='Enter quantity']")).sendKeys("5");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your price']")).sendKeys("5000");
//		{
//			WebElement dropdown = driver.findElement(By.xpath("//select[@name='selectedId']"));
//			dropdown.findElement(By.xpath("//option[.='2']")).click();
//		}
//		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
//		Thread.sleep(3000);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());

	}
	
	@Test
	void missingFieldsInOrderMaterialQuantity() throws InterruptedException {
		driver.get(url+"/addOrder");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Cotton");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your price']")).sendKeys("5000");
//		{
//			WebElement dropdown = driver.findElement(By.xpath("//select[@name='selectedId']"));
//			dropdown.findElement(By.xpath("//option[.='2']")).click();
//		}
//		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
//		Thread.sleep(3000);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());

	}
	
	@Test
	void missingFieldsInOrderMaterialPrice() throws InterruptedException {
		driver.get(url+"/addOrder");
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Cotton");
//		driver.findElement(By.xpath("//input[@placeholder='Enter quantity']")).sendKeys("5");
//		{
//			WebElement dropdown = driver.findElement(By.xpath("//select[@name='selectedId']"));
//			dropdown.findElement(By.xpath("//option[.='2']")).click();
//		}
//		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
//		Thread.sleep(3000);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}

}
