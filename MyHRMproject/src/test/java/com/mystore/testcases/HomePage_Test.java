package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysore.pageobject.IndexPage;
import com.mystore.actionDriver.HomePage;
import com.mystore.actionDriver.LoginPage;
import com.mystore.actionDriver.PIM;
import com.mystore.base.BaseClass;

public class HomePage_Test extends BaseClass {
	
	IndexPage index;
	LoginPage login;
	HomePage homePage;
	
	// @BeforeMethod
		public void setup() {
			loadConfig();
		 //launchApp();
		}
	 
	
	// @Test
	private void clickLg() throws InterruptedException {
		 driver.wait(1000);
		 login=new LoginPage();
		 homePage=new HomePage();
		 
		 homePage=login.clickLogin(prop.getProperty("username"),prop.getProperty("password"));
		 
		 
		 
				  }
}


