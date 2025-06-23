package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class DataProvide {
	@DataProvider
	public Object[][] setData()
	{
		Object[][] data = {
							{"http://localhost/login.do","admin","manager"},
							{"http://localhost/login.do","admin1","manager2"},
							{"http://localhost/login.do","admin2","manager2"}
							};
		return data;
			
 	}

	@Test(dataProvider="setData")
	public void login(String url, String un, String pwd)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	
		
	}
	
}
