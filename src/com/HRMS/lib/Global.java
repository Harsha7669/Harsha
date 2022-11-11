package com.HRMS.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Global extends General
{
//StdRule: To provide all re usable fun:/methods of whole application
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
	}
	public void closeApplication()
	{
		driver.quit();
		System.out.println("Application closed");
	}
	public void login()
	{
		driver.findElement(By.name(loginname)).sendKeys(UserName);
		driver.findElement(By.name(loginpassword)).sendKeys(Password);
		driver.findElement(By.name(loginbutton)).click();
		System.out.println("login completed");
	}
	public void logout()
	{
		driver.findElement(By.linkText(logoutlink)).click();
		System.out.println("logout comppleted");
	}
	 
}
