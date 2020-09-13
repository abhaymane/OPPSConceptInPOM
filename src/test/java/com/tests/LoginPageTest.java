package com.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	@Test(priority=1)
	public void verifyloginPageTitleTest() {
		String pagetitle=page.getinstance(LoginPage.class).getLoginPagetitle();
		System.out.println("Loginpage title is:"+pagetitle);
		Assert.assertEquals(pagetitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test
	public void verifyloginLogo() {
	WebElement element=page.getinstance(LoginPage.class).getCrmLogo();
	System.out.println("LoginPage logo:"+element);
		
	}
	@Test
	public void verifyLoginTest() {
		HomePage homepage=page.getinstance(LoginPage.class).doLogin("Mayuri_257","mayuri$257");
		String userName=homepage.getHomePageUserName();
		System.out.println(userName);
		Assert.assertEquals(userName, "  User: Mayuri Deshmukh");
		
	}

}
