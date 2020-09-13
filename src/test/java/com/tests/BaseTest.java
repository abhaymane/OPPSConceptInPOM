package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.pages.BasePage;
import com.pages.Page;

public class BaseTest {
	WebDriver driver;
	public Page page;
	
	
	@Parameters(value={"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("ff")) {
			System.setProperty("webdriver.ecko.driver",".//Driver//firefoxdriver.exe");
			driver=new ChromeDriver();
		}
		else {
			System.out.println("no browser is defined in xml file");
		}
		driver.get("https://www.crmpro.com/index.html");
		page=new BasePage(driver);
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}

