package com.mystore.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysore.pageobject.IndexPage;
import com.mystore.actionDriver.LoginPage;
import com.mystore.base.BaseClass;

public class IndexPage_Test extends BaseClass  {
	IndexPage indexPage;
	String lg="Login";
    //@BeforeMethod
	public void setup() {
		loadConfig();
	}
   /* @AfterMethod
    public void tearDown() {
    	driver.quit();
    }*/
    
    public void verifyLogo() {
    	indexPage=new IndexPage();
    	boolean result=indexPage.validateLogo();
    	Assert.assertTrue(result);
    	
    
    	
    	  	}
    	  }

