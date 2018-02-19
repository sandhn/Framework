package com.projectname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTourLoginPage 
{

	@FindBy(name="userName")
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement signin;
	
	public NewTourLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPwd(String passwd)
	{
		pwd.sendKeys(passwd);
	}
	
	public void clickONLogin()
	{
		signin.click();
	}
	
}
