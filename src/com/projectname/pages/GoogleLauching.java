package com.projectname.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleLauching
{

	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value= "./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("C:\\Users\\sandhn\\Desktop\\select.html");
		WebElement hotel = driver.findElement(By.id("slv"));
		Select sel= new Select(hotel);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);		
		List<WebElement> options = sel.getAllSelectedOptions();
		for(WebElement option:options)
		{
			//WebElement option = options.get(i);
			String opt = option.getText();
			System.out.println(opt);
			
		}
		
				
	}
	
	
	
}
