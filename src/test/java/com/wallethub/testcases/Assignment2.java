package com.wallethub.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wallethub.generic.IConst;
import com.wallethub.generic.TestBase;
import com.wallethub.pages.actions.Wallethub_Login_Page;


public class Assignment2 {
	@BeforeMethod
	public static void setUp()
	{
		//Step 1. Go to this URL: http://wallethub.com/profile/test_insurance_company/
		TestBase.initConfiguration(IConst.URL_ASSIGNMENT21);	
	}

	@Test(invocationCount = 1)
	public static void wallethub_activity() {
		Wallethub_Login_Page wallethub_login = new Wallethub_Login_Page();
		wallethub_login.login_to_wallethub();
		//Step 2 to 6
		wallethub_login.add_review();
		//Step 7. Go to https://wallethub.com/profile/<username> and assert that you can see the review
		TestBase.driver.get(IConst.URL_ASSIGNMENT22);
		wallethub_login.assertReview();
		
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
