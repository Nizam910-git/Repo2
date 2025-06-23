package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="(//a)[2]/div[1]")
	private WebElement TaskTab;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout()
	{
		logout.click();
	}
	
	public void setTaskTab()
	{
		TaskTab.click();
	}
}
