package com.HRMS.Test_Scripts;

import org.testng.annotations.Test;


import com.HRMS.lib.General_1;


public class TC_02 {
	//public static void main(String args[]) {
	@Test
	public void tc002() {
	    //Test Steps
	  General_1 obj = new General_1();
	  obj.openApplication();
	  obj.login();
	  obj.enterFrame();
	  obj.addNewEmp();
	  obj.exitFrame();
	  obj.logout();
	  obj.closeApplication();
	}
}
