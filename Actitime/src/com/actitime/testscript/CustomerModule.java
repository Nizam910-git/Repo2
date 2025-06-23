package com.actitime.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base1;
import com.actitime.generic.FileLibb;
import com.actitime.pom.Homepage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListernerImplementationn.class)
public class CustomerModule extends Base1  {
	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		Reporter.log("Create customer",true);
		FileLibb f = new FileLibb();
		String CxName = f.getExcelData("CreateCustomer", 1, 3);
		String CxDes = f.getExcelData("CreateCustomer", 1, 4);
		Homepage h = new Homepage(driver);
		h.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerOption().click();
		t.getEnterCxNameTbx().sendKeys(CxName);
		t.getCxDescriptionTbx().sendKeys(CxDes);
		t.getSelectCxDD().click();
		t.getOurCompanyOption().click();
		t.getCreateCx().click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCxCreated(), CxName));
		String actualCxName = t.getActualCxCreated().getText();
		Assert.assertEquals(actualCxName, CxName);
		t.getCxSettings().click();
		t.getCxNameChange().click();
		t.getCxNameChange().sendKeys("ICIC_002");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
