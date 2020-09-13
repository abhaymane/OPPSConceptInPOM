package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {


	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageLogo(By locator) {
		return driver.findElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
			element=driver.findElement(locator);
		}
		catch(Exception e) {
			System.out.println("some error occured while creating element"+element);
			e.printStackTrace();
		}
		return element;
		
	}

	@Override
	public void waitForElementPresent(By locator) {
		WebElement element=null;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e) {
			System.out.println("some error occured while waiting for the element"+element);
			e.printStackTrace();
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e) {
			System.out.println("some error occured while waiting for the element"+title);
			e.printStackTrace();
		}
		
		
	}

	@Override
	public String getUserName(By locator) {
		return driver.findElement(locator).getText();
	}

}
