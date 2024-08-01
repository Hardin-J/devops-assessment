package com.mrj.curtain_store.selenium_test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class UpdateOrderTest {

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
	void validUpdateOrder() throws InterruptedException {
		driver.get(url + "/updateOrder/1");

//		WebElement material = driver.findElement(By.cssSelector("input[placeholder='Enter your Name']"));
//		material.clear();
//		material.sendKeys("Fiber");
//		Thread.sleep(300);
//
//		WebElement quantity = driver.findElement(By.name("quantity"));
//		quantity.clear();
//		quantity.sendKeys("5");
//		Thread.sleep(300);
//
//		WebElement price = driver.findElement(By.name("price"));
//		price.clear();
//		price.sendKeys("1000");
//		Thread.sleep(300);
//
//		{
//			WebElement dropdown = driver.findElement(By.xpath("//select[@name='selectedId']"));
//			dropdown.findElement(By.xpath("//option[.='2']")).click();
//		}
//		Thread.sleep(300);
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(300);
//		assertEquals("Data udpated Successfully", driver.switchTo().alert().getText());
	}
	@Test
	void missingFieldUpdateOrderMaterial() throws InterruptedException {
		driver.get(url + "/updateOrder/1");
		
//		WebElement material = driver.findElement(By.cssSelector("input[placeholder='Enter your Name']"));
//		material.clear();
//				
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	@Test
	void missingFieldUpdateOrderQuantity() throws InterruptedException {
		driver.get(url + "/updateOrder/1");
		
//		WebElement quantity = driver.findElement(By.name("quantity"));
//		quantity.clear();
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}
	
	@Test
	void missingFieldUpdateOrderPrice() throws InterruptedException {
		driver.get(url + "/updateOrder/1");		
//		WebElement price = driver.findElement(By.name("price"));
//		price.clear();
//	
//		Thread.sleep(300);
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(300);
//		assertEquals("Please Enter the Valid Inputs!!!", driver.switchTo().alert().getText());
	}

}
