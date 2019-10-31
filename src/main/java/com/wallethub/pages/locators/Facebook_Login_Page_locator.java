package com.wallethub.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_Login_Page_locator {
	@FindBy(xpath="//input[@id='email']")
	public WebElement usernameInp;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement passwordInp;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	public WebElement loginBtn;
}
