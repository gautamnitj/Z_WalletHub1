package com.wallethub.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wallethub_Login_Page_locator {
	@FindBy(xpath="//span[text()='Login']")
	public WebElement loginBtn;
	@FindBy(xpath="//input[@name='em']")
	public WebElement un;
	@FindBy(xpath="//input[@name='pw']")
	public WebElement pw;
	@FindBy(xpath="//span[text()='Reviews']")
	public WebElement reviews;
	@FindBy(xpath="(//span[@class='dropdown-placeholder'])[2]")
	public WebElement dropdown;
	@FindBy(xpath="//li[text()='Health Insurance']")
	public WebElement healthInsurance;
	@FindBy(xpath="//textarea[@class='textarea wrev-user-input validate']")
	public WebElement reviewTextArea;
	@FindBy(xpath="//div[text()='Submit']")
	public WebElement submitBtn;
	@FindBy(xpath="//h4[text()='Your review has been posted.']")
	public WebElement confirmMsg;
	@FindBy(xpath="//div[text()='Continue']")
	public WebElement continueBtn;
	@FindBy(xpath="//*[@id='scroller']/main/div[2]/div/section/div/div/div/div[2]/a")
	public WebElement rev;
	@FindBy(xpath="//*[@id='reviews-section']/div[2]/span/span")
	public WebElement rev1;
	@FindBy(xpath="//*[@id='reviews-section']/div[2]/div/span[1]")
	public WebElement rev2;
	@FindBy(xpath="//*[@id='reviews-section']/section/article[1]/div[4]/p")
	public WebElement rev3;
}

