package com.org;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class addtocartTest {
	WebDriver driver;
  @Test
  public void addtocart() throws InterruptedException {
	  
	
	 
	
	
	 driver.findElement(By.name("submit.add-to-cart")).click();
	 Thread.sleep(3000);
  }
  @BeforeMethod
  public void openURL() {
	  driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Blue/dp/B09G9BL5CP/ref=sr_1_1_sspa?keywords=iphone+13&qid=1648552280&s=electronics&sprefix=iph%2Celectronics%2C449&sr=1-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFWSlgxMzdVSDRFSVQmZW5jcnlwdGVkSWQ9QTAwMzY5NDExRTJWMjJMOVFSNFgwJmVuY3J5cHRlZEFkSWQ9QTA4NzI5MTYyV0hXQUozWEJHR0tVJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
	  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
  }

  @AfterMethod
  public void postaddtocart() {
	  System.out.println(driver.getCurrentUrl());
  }

  @BeforeClass
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\Desktop\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }



}
