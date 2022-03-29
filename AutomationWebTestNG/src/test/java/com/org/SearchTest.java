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

public class SearchTest {
	WebDriver driver;
  @Test
  public void search() throws InterruptedException {
	  
	
	  driver.findElement(By.name("field-keywords")).sendKeys("iphone 13");
	  Thread.sleep(1000);
	 
	  
	 WebElement search= driver.findElement(By.id("nav-search-submit-button"));
	 
	 search.click();
	 Thread.sleep(3000);
  }
  @BeforeMethod
  public void openURL() {
	  driver.get("https://www.amazon.in/");
	  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
  }

  @AfterMethod
  public void postSearch() {
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
