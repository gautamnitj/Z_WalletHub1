package com.wallethub.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.wallethub.generic.IConst;
import com.wallethub.generic.TestBase;
import com.wallethub.pages.locators.Facebook_Login_Page_locator;

public class Facebook_Login_Page extends TestBase{
	public Facebook_Login_Page_locator facebook_login_Page_locator;
	public Facebook_Login_Page()
	{
		this.facebook_login_Page_locator = new Facebook_Login_Page_locator();
		PageFactory.initElements(driver, this.facebook_login_Page_locator);
	}
	public Facebook_Home_Page login_to_fb()
	{
		facebook_login_Page_locator.usernameInp.sendKeys(IConst.FB_USERNAME);
		facebook_login_Page_locator.passwordInp.sendKeys(IConst.FB_PASSWORD);
		facebook_login_Page_locator.loginBtn.click();
		
		return new Facebook_Home_Page();
	}
}
