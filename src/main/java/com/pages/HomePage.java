package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//page locator:
	
	private By user = By.xpath("//td[contains(text(),'User: Mayuri Deshmukh')]");
	/**
	 * @return the user
	 */
	public WebElement getUser() {
		return getElement(user);
	}
	//page Action:
	
	public String getHomePageTitle() {
		return getPageTitle();
	}
	public String getHomePageUserName() {
		return getUserName(user);
	}
	
	
	
	
}
