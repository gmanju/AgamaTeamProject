package com.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.Library;
import com.qa.pages.CallsCRM;
import com.qa.pages.LoginCRM;

public class TC_07_CallsCRM extends Library{
	
LoginCRM crm;
CallsCRM cal;
	
	@BeforeMethod()
	public void startup() {
		Browserlaunch();
		crm= new LoginCRM(driver);
		 crm.login();
		 crm.Email(prop.getProperty("username"),prop.getProperty("password"));
		 crm.Lbutton();
	}
	@Test()
	public void callspage() throws IOException {
		cal.calls();
		cal.info(prop.getProperty("contacts"));
		cal.types();
		cal.dura(prop.getProperty("duration"));
		cal.save();
		sreenshot("src/test/resources/Screenshot/call.png");
	}
	@AfterMethod()
	public void close() {
		
		cal.logout();
				
		
	}

}
