package com.HRMS.Test_Scripts;

import com.HRMS.AddEmp.AddEmp_Method;

public class TC002 {

	public static void main(String[] args) throws Exception {
		AddEmp_Method obj = new AddEmp_Method();
		obj.openApplication();
		Thread.sleep(3000);
		obj.login();
		Thread.sleep(3000);
		obj.enterFrames();
		obj.addEmp();
		Thread.sleep(3000);
		obj.exitFrames();
		Thread.sleep(3000);
		obj.logout();
		Thread.sleep(3000);
		obj.closeApplication();

	}

}
