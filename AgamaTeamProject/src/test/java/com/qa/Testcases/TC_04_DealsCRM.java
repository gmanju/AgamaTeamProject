package com.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.Library;
import com.qa.pages.DealsCRM;
import com.qa.pages.LoginCRM;

public class TC_04_DealsCRM extends Library{
DealsCRM Deal;
LoginCRM crm;
	
	@BeforeMethod()
	public void startup() {
		Browserlaunch();
		crm= new LoginCRM(driver);
		 crm.login();
		 crm.Email(prop.getProperty("username"),prop.getProperty("password"));
		 crm.Lbutton();
	}
	
		
		@Test
		public void Dealspage() throws IOException {
			Deal=new DealsCRM(driver);
			Deal.deals();
			Deal.title(prop.getProperty("title"));
			Deal.comp(prop.getProperty("company"),prop.getProperty("amount"));
			Deal.status();
			Deal.cdate();
			Deal.stage(prop.getProperty("stage"));
			sreenshot("src/test/resources/Screenshot/Deals1.png");
			
		}
		
		@AfterMethod()
		public void close() throws IOException {
			Deal.logout();
		}

}
