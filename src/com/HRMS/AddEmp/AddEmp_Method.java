package com.HRMS.AddEmp;

import org.openqa.selenium.By;

public class AddEmp_Method extends TC002_AddEmp {

		//User Defined methods 
		public void enterFrames()
		{
			driver.switchTo().frame(frames);
			System.out.println("Enter into frames");
		}
		public void addEmp()
		{
			driver.findElement(By.xpath(addbtn_xpath)).click();
			System.out.println("add btn is clicked");
			driver.findElement(By.name(EmpFirstName)).sendKeys(FirstName);
			driver.findElement(By.name(EmpLastName)).sendKeys(LastName);
			driver.findElement(By.id(savebtnid)).click();
			System.out.println("add emp is completed");
	}
		public void exitFrames()
		{
			driver.switchTo().defaultContent();
			System.out.println("Exit from frames");
		}

}
