package com.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseclass.Library;
import com.qa.pages.LoginCRM;

public class TC_01_LoginCRM extends Library {
	
	LoginCRM crm;
	
	@BeforeMethod()
	public void startup() {
		Browserlaunch();
	}
	
		@Test 
		public void login() throws IOException
		{
		 crm = new LoginCRM(driver);
		 crm.login();
		 crm.Email(prop.getProperty("username"),prop.getProperty("password"));
		 crm.Lbutton();
		 sreenshot("src/test/resources/Screenshot/login.png");
			
	}
		
@AfterMethod()
public void close() throws IOException {
	//sreenshot("C:\\screenshot.png");
	crm.logout();
	
}

}


