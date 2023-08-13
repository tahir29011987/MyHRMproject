package com.mystore.actionDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//*[@class=\"oxd-topbar-header-breadcrumb\"]")
	WebElement Dash;
	@FindBy(xpath="//*[@class=\"oxd-input oxd-input--active\"]")
	WebElement search;
	@FindBy(xpath="//*[@class=\"oxd-main-menu-item active\"]")
	WebElement admin;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]")
	WebElement pim;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	
	}
	public PIM validate_PIM() {
	Action.click(driver, pim);
	return new PIM();
	}
	public String getCurrentUrl() {
		String HomecurrentUrl=driver.getCurrentUrl();
		return HomecurrentUrl;
	}
	
}
