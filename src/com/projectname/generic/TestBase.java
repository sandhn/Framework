package com.projectname.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String key="webdriver.chrome.driver"; // Should be before suite
		String value= "./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("http://newtours.demoaut.com/");
		
		//driver.close();  //should be after suite

	}

}
