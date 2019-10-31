package Rough;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.wallethub.generic.IConst;

public class rough_exec {
	
	
	public static void main(String[] args)
	{
		System.setProperty(IConst.CHROME_KEY, IConst.CHROME_VALUE);
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");

		WebDriver driver = new ChromeDriver(options);
		
		/*
		 
		//Assigment 1
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//UN & PWD
		
		try {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(IConst.FB_USERNAME);		
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(IConst.FB_PASSWORD);
			driver.findElement(By.xpath("//label[@id='loginbutton']")).click();	
		}
		catch(Exception e)
		{	
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(IConst.FB_USERNAME);		
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(IConst.FB_PASSWORD);
			driver.findElement(By.xpath("//button[@name='login']")).click();	
		}

		
		//
		driver.findElement(By.xpath("//textarea[contains(@title,'Write something here')]")).sendKeys(IConst.FB_STATUS_MSG);
		WebDriverWait w = new WebDriverWait(driver, 20);

		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Post']"))));
		//w.until(ExpectedConditions.)
		driver.findElement(By.xpath("//span[text()='Post']")).click();
		*/
		///Assignment 2
		
		driver.get("http://wallethub.com/profile/test_insurance_company/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Login']")).click();//
		driver.findElement(By.xpath("//input[@name='em']")).sendKeys("gautam.nitj@gmail.com");//
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Sandhya1!");//
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		/*
		driver.findElement(By.xpath("//span[text()='Reviews']")).click();
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
		driver.findElement(By.xpath("(//span[@class='dropdown-placeholder'])[2]")).click();
		//click health insurance
		driver.findElement(By.xpath("//li[text()='Health Insurance']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//200 review
		String inp_feed = "random6 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 ";
		driver.findElement(By.xpath("//textarea[@class='textarea wrev-user-input validate']")).click();
		driver.findElement(By.xpath("//textarea[@class='textarea wrev-user-input validate']")).sendKeys(inp_feed);
		//submit
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='Submit']")).click();
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[text()='Your review has been posted.']"))));
		//		try {
//			Thread.sleep(15000);
//			.isDisplayed();
//		}
//		catch(Exception e)
//		{
//			Assert.assertTrue(false, "Review comments not posted successfully");
//		}
		//click on continue
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		*/
		//click recent feed
		driver.findElement(By.xpath("//*[@id=\"reviews-section\"]/div[2]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"reviews-section\"]/div[2]/div/span[1]")).click();
		String out_feed = driver.findElement(By.xpath("//*[@id='reviews-section']/section/article[1]/div[4]/p")).getText();
		String inp_feed = "random6 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1 random1";
		System.out.println(inp_feed);
		System.out.println(out_feed);
		//Assert.assertEquals(out_feed, inp_feed);
		Assert.assertEquals(out_feed, inp_feed);

		
		
		
		
		//*[@id="scroller"]/main/div[2]/div/section/div/h2
		
		/*
		driver.get("https://wallethub.com/profile/gautam_nitj");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("https://wallethub.com/profile/gautam_nitj")).getText());
		*/
	}
}
