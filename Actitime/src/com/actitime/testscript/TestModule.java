package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Base1;

@Test
public class TestModule extends Base1{

	public void testTestModule()
	{
		Reporter.log("CreateTestModule.",true);
	}
}
