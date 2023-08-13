package com.mysore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	

	@FindBy(xpath="//*[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")
	WebElement log;
	
	public IndexPage() {
		PageFactory.initElements(driver,this);
	}
	public boolean validateLogo() {
		
		return Action.isDispyed(driver, log);
		}
	public String getHomeTitle() {
		String Title=driver.getTitle();
		return Title;
		
	}
}
