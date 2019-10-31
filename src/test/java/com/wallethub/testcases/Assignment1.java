package com.wallethub.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wallethub.generic.IConst;
import com.wallethub.generic.TestBase;
import com.wallethub.pages.actions.Facebook_Home_Page;
import com.wallethub.pages.actions.Facebook_Login_Page;


public class Assignment1 {
	@BeforeMethod
	public static void setUp()
	{
		TestBase.initConfiguration(IConst.URL_ASSIGNMENT1);	
	}

	@Test//(invocationCount = 10)
	public static void facebook_activity() {
		Facebook_Login_Page fb_login = new Facebook_Login_Page();
		//Step 1. Login to Facebook. Username and Password should be on a variable we can change.
		//Below step invokes FB login and credentials reside in Z_WalletHub1\src\main\java\com\wallethub\generic\IConst.java
		Facebook_Home_Page fb_home = fb_login.login_to_fb();
		//Step 2. Post a status message "Hello World"
		fb_home.postStatusMessage();
	}
	@AfterMethod
	public static void quit() 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestBase.quitBrowser();
	}
}
