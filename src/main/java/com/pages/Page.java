package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	WebDriver driver;
	WebDriverWait wait;
	public Page(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 10);
	}
	//Abstract method
	public abstract String getPageTitle() ;
	
	public abstract String getPageLogo(By locator);
	
	public abstract String getUserName(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title);
		
   
	public <Tpage extends BasePage>Tpage getinstance(Class<Tpage>pageClass){
		try {
	
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
		return null;
		}
	}

