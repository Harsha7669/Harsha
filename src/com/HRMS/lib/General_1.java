package com.HRMS.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General_1 extends Global_1{
	
		//StdRule: To provide all re-usable fun:/methods of whole application
		public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");

		}
		public void closeApplication() {
		driver.quit();
		System.out.println("Application closed");
		}
		public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		}
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		}
		public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		}
		public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");
		}
		public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);

		driver.findElement(By.id(btn_Save)).click();
		System.out.println("New Emp Added");
		}
}
