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

public class LoginTest {
	WebDriver driver;
  @Test
  public void login() throws InterruptedException {
	  
	
	  driver.findElement(By.name("email")).sendKeys("user@gmail.com.com");
	  driver.findElement(By.name("password")).sendKeys("user");
	 
	  
	 WebElement login= driver.findElement(By.id("login-button"));
	 
	 login.click();
	 Thread.sleep(3000);
  }
  @BeforeMethod
  public void openURL() {
	  driver.get("http://localhost:8080/Medicare/login.jsp");
	  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
  }

  @AfterMethod
  public void postLogin() {
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
