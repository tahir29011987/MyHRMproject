package com.mystore.actionDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//*[@name=\"username\"]")
	WebElement usename;
	@FindBy(xpath="//*[@name=\"password\"]")
	WebElement paswrd;
	@FindBy(xpath="//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	WebElement Logn;
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
	WebElement Forgetpass;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public HomePage clickLogin(String username,String password) {
		Action.type(usename,username);
		Action.type(paswrd, password);
		Action.click(driver, Logn);
		return new HomePage();
	}
	
	
	
	

}
