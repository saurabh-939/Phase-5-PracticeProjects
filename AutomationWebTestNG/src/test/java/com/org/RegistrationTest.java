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

public class RegistrationTest {
	WebDriver driver;
  @Test
  public void signup() throws InterruptedException {
	  
	  driver.findElement(By.name("customerName")).sendKeys("Saurabh Shinde");
	  driver.findElement(By.name("email")).sendKeys("okgjydqmzowkbzsmie@bvhrs.com");
	  driver.findElement(By.name("password")).sendKeys("Test1234");
	  driver.findElement(By.name("passwordCheck")).sendKeys("Test1234");
	  
	 WebElement signup= driver.findElement(By.id("continue"));
	 
	 signup.click();
	 Thread.sleep(3000);
  }
  @BeforeMethod
  public void openURL() {
	  driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=CNQ25Y60NGD5XYR651TF&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 
	  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
  }

  @AfterMethod
  public void postSignup() {
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
