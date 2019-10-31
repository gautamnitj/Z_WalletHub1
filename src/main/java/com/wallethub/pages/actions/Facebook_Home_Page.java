package com.wallethub.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wallethub.generic.IConst;
import com.wallethub.generic.TestBase;
import com.wallethub.pages.locators.Facebook_Home_Page_locator;

public class Facebook_Home_Page extends TestBase{
	public Facebook_Home_Page_locator facebook_Home_Page_locator;
	public Facebook_Home_Page()
	{
		this.facebook_Home_Page_locator = new Facebook_Home_Page_locator();
		PageFactory.initElements(driver, this.facebook_Home_Page_locator);
	}
	public void postStatusMessage()
	{
		facebook_Home_Page_locator.msgTxt.sendKeys(IConst.FB_STATUS_MSG);
		//WebDriverWait w = new WebDriverWait(driver, 20);
		//w.until(ExpectedConditions.visibilityOf())
		facebook_Home_Page_locator.postBtn.click();
	}
	
}
