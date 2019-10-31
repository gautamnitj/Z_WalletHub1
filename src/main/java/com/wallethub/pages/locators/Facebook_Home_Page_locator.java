package com.wallethub.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_Home_Page_locator {
	@FindBy(xpath="//textarea[contains(@title,'Write something here')]")
	public WebElement msgTxt;
	@FindBy(xpath="//span[text()='Post']")
	public WebElement postBtn;
}
