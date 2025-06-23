package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[contains(text(),'New Customer')]")
	private WebElement newCustomerOption;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement enterCxNameTbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement cxDescriptionTbx;
	
	@FindBy(xpath="//button[contains(text(),'Select an active customer ')]")
	private WebElement selectCxDD;
	
	@FindBy(xpath="//a[.='Our Company']")
	private WebElement ourCompanyOption;
	
	@FindBy(xpath="//span[.='Create Customer']")
	private WebElement createCx;
	
	@FindBy(xpath="//div[@class='navigationLinks']/../div[@class='title ellipsis']")
	private WebElement actualCxCreated;
	
	@FindBy(xpath="//div[text()='HDFC_001 ']/../div[@class='editButton available']")
	private WebElement CxSettings;
	
	@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']//input[@type='text']")
	private WebElement CxNameChange;
	
	public WebElement getCxSettings() {
		return CxSettings;
	}

	public WebElement getCxNameChange() {
		return CxNameChange;
	}

	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getEnterCxNameTbx() {
		return enterCxNameTbx;
	}

	public WebElement getCxDescriptionTbx() {
		return cxDescriptionTbx;
	}

	public WebElement getSelectCxDD() {
		return selectCxDD;
	}

	public WebElement getOurCompanyOption() {
		return ourCompanyOption;
	}

	public WebElement getCreateCx() {
		return createCx;
	}

	public WebElement getActualCxCreated() {
		return actualCxCreated;
	}
	
	
}
