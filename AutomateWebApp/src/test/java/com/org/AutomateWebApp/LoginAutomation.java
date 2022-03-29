package com.org.AutomateWebApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAutomation {
	



	
	
	@Test
	public static void login() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("https://www.browserstack.com/users/sign_in");
	WebElement username=driver.findElement(By.name("user[login]"));
	WebElement password=driver.findElement(By.id("user_password"));
	WebElement login=driver.findElement(By.xpath("/html/body/main/div[4]/section/form/div[1]/div/div[1]/div[10]/div/input"));
	username.sendKeys("sbb55196@uooos.com");
	password.sendKeys("password");
	login.click();
	String actualUrl="https://live.browserstack.com/dashboard";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
	
}
}

