package com.HRMS.Test_Scripts;

import com.HRMS.lib.Global;

public class TC001 {

	public static void main(String[] args)throws Exception {
		//Test Steps
		Global object = new Global();
		object.openApplication();
		Thread.sleep(3000);
		object.login();
		Thread.sleep(3000);
		object.logout();
		Thread.sleep(3000);
		object.closeApplication();
	}

}
