package com.org.AutomateWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class RegistrationAutomation {
	@BeforeTest
	public static void registation() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.browserstack.com/users/sign_up");
		WebElement fullname =driver.findElement(By.name("user[full_name]"));
		WebElement email=driver.findElement(By.name("user[email]"));
		WebElement password=driver.findElement(By.name("user[password]"));
		WebElement login=driver.findElement(By.xpath("/html/body/main/div[4]/section/form/div[1]/div/div[1]/div[10]/div/input"));
		WebElement check=driver.findElement(By.name("terms_and_conditions"));
		fullname.sendKeys("Test Test");
		email.sendKeys("sbb55196@uooos.com");
		password.sendKeys("password");
	
		boolean flag2 = check.isSelected();
		if(flag2) {
			
		}else {
			check.click();
		}
			
			
			try {
				Thread.sleep(3000);
				login.click();
					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		String actualUrl="https://accounts.browserstack.com/confirmation";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		
	}

}
