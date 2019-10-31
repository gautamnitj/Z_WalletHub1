package com.wallethub.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.wallethub.generic.IConst;
import com.wallethub.generic.TestBase;
import com.wallethub.pages.locators.Facebook_Home_Page_locator;
import com.wallethub.pages.locators.Wallethub_Login_Page_locator;

public class Wallethub_Login_Page extends TestBase{
	public Wallethub_Login_Page_locator wallethub_Login_Page_locator;
	String inp_feed = "random6 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1";
	public Wallethub_Login_Page()
	{
		this.wallethub_Login_Page_locator = new Wallethub_Login_Page_locator();
		PageFactory.initElements(driver, this.wallethub_Login_Page_locator);
	}
	public void login_to_wallethub()
	{
		wallethub_Login_Page_locator.loginBtn.click();
		wallethub_Login_Page_locator.un.sendKeys(IConst.WALLETHUB_USERNAME);
		wallethub_Login_Page_locator.pw.sendKeys(IConst.WALLETHUB_PASSWORD);
		wallethub_Login_Page_locator.loginBtn.click();
	}
	public void add_review()
	{
		wallethub_Login_Page_locator.reviews.click();
		Actions act = new Actions(driver);
		String xp=null;
		for(int i = 1; i<=4;i++)
		{
			xp = "((//div[@class='rating-box-wrapper'])[3]/*[name()='svg'])["+i+"]";
			System.out.println(xp);
			//act.moveToElement(driver.findElement(By.xpath("((//div[@class='rating-box-wrapper'])[3]/*[name()='svg'])[1]")));
			act.moveToElement(driver.findElement(By.xpath(xp))).build().perform();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//act.moveToElement(driver.findElement(By.xpath("((//div[@class='rating-box-wrapper'])[3]/*[name()='svg'])[2]")));
		}
		driver.findElement(By.xpath(xp)).click();
		//click dropdown
		wallethub_Login_Page_locator.dropdown.click();
		//click health insurance
		wallethub_Login_Page_locator.healthInsurance.click();
		//200 review
		
		wallethub_Login_Page_locator.reviewTextArea.sendKeys(inp_feed);
		
		wallethub_Login_Page_locator.submitBtn.click();
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(wallethub_Login_Page_locator.confirmMsg));
		
		wallethub_Login_Page_locator.continueBtn.click();
	}
	public void assertReview()
	{
		wallethub_Login_Page_locator.rev.click();
		//click recent feed
		//driver.findElement(By.xpath("//*[@id='reviews-section']/div[2]/span/span")).click();
		wallethub_Login_Page_locator.rev1.click();
		//driver.findElement(By.xpath("//*[@id='reviews-section']/div[2]/div/span[1]")).click();
		wallethub_Login_Page_locator.rev2.click();
		WebDriverWait w = new WebDriverWait(driver, 10);
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='reviews-section']/section/article[1]/div[4]/p"))));
		w.until(ExpectedConditions.visibilityOf(wallethub_Login_Page_locator.rev3));
		String out_feed = wallethub_Login_Page_locator.rev3.getText();
		
		System.out.println("INPPPP:"+inp_feed);
		System.out.println("OUTTTT:"+out_feed);
		//Assert.assertEquals(out_feed, inp_feed);
		Assert.assertEquals(out_feed, inp_feed);
	}
}
