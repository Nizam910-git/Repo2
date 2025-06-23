package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.Homepage;
import com.actitime.pom.LoginPage;

public class Base1 {
	public  static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		Reporter.log("OpenBrowser",true);
		driver = new ChromeDriver();
		FileLibb f = new FileLibb();
		String url = f.getPropertyData("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void Login() throws IOException
	{
		Reporter.log("Login",true);
		FileLibb f = new FileLibb();
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pwd);
		
	}
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout",true);
		Homepage hp = new Homepage(driver);
		hp.setLogout();
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		Reporter.log("CloseBrowser",true);
		driver.quit();
	}
	
}
