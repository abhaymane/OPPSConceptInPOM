package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	//page locator
	private By userName=By.name("username");
	private By userPass=By.name("password");
	private By loginBtn=By.xpath("//input[@type='submit']");
	private By crmLogo=By.xpath("/html/body/div[2]/div/div/a");
	
	//getter:
	
	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return getElement(userName);
	}
		
	
	/**
	 * @return the userPass
	 */
	public WebElement getUserPass() {
		return getElement(userPass);
	}
	
	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}
	
	
	/**
	 * @return the crmLogo
	 */
	public WebElement getCrmLogo() {
		return getElement(crmLogo);
	}

	public String getLoginPagetitle() {
		return getPageTitle();
	}
		
	public HomePage doLogin(String username,String pwd) {
		getUserName().sendKeys(username);
		getUserPass().sendKeys(pwd);
		getLoginBtn().click();
		return getinstance(HomePage.class);
	}
	public void doLogin() {
		getUserName().sendKeys("");
		getUserPass().sendKeys("");
		getLoginBtn().click();
		
	}
	public void doLogin(String userCred) {
		if(userCred.contains("username")) {
			getUserName().sendKeys(userCred.split(":")[1].trim());
		}else if(userCred.contains("userPass")) {
			getUserPass().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginBtn().click();
	}
}
