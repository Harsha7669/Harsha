package com.HRMS.lib;

import org.openqa.selenium.WebDriver;

public class Global_1 {
	public     WebDriver driver;
	//******************TestData
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String FN  = "Harsha";
	public String LN  = "selenium";

	//****************Objects/Elements
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_logout   = "Logout";
	public String frame_empinfo = "rightMenu";
	public String btn_Add       = "//input[@value='Add']";
	public String txt_EFN       = "txtEmpFirstName";
	public String txt_ELN       = "txtEmpLastName";
	public String btn_Save      = "btnEdit";

	}

