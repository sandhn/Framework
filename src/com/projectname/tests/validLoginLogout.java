package com.projectname.tests;

import org.openqa.selenium.WebDriver;

import com.projectname.generic.TestBase;
import com.projectname.pages.NewTourLoginPage;

public class validLoginLogout extends TestBase
{
	public void validLogin()
	{
		 WebDriver driver = null;
		NewTourLoginPage lp=new NewTourLoginPage(driver);
		lp.enterUserName("Demo");
		lp.enterPwd("demo");
		lp.clickONLogin();
		
	}
	
}
