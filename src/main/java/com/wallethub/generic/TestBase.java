package com.wallethub.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class TestBase implements IConst{
	public static WebDriver driver;
	public static void initConfiguration(String url) {
		if (driver == null) {
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				//driver = new ChromeDriver();
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_setting_values.notifications", 2);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", prefs);
				options.addArguments("--disable-extensions");
				options.addArguments("--disable-infobars");

				driver = new ChromeDriver(options);
			}
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		}
	}
	public static void quitBrowser() {
		//Thread.sleep(3000);
		driver.quit();
		driver=null;
	}
}
