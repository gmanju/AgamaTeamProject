package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DealsCRM {
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement Deals;
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
	WebElement New;
	@FindBy(xpath="//input[@name='title']")
	WebElement Title;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement Company;
	@FindBy(xpath="//input[@name='amount']")
	WebElement Amount;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div")
	WebElement Status;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div/div[2]/div[2]/span")
	WebElement New1;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div[1]/div/input")
	WebElement CloseDate;
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--011']")
	WebElement Date;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div")
	WebElement Stage;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div/div[2]/div[4]/span")
	WebElement Research;
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement save;
	@FindBy(xpath="//i[@class='settings icon']")
	WebElement setting;
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	WebElement Logout;
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[1]/span")
	WebElement Home;
	 WebDriver driver;

	public DealsCRM(WebDriver rdriver) {
		this.driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void deals() {
		Deals.click();
		New.click();
	}
	public void title(String name) {
		Title.sendKeys(name);
		
	}
	public void comp(String com,String amt) {
	Company.sendKeys(com);
		Amount.sendKeys(amt);
	}
	public void status() {
     Status.click();
     
     New1.click();
	}
	public void cdate() {
		CloseDate.click();
		Date.click();
	}
	public void stage(String res) {
		Stage.click();
		Research.click();
		//Select sel=new Select(Stage);
		//sel.selectByVisibleText(res);
		save.click();
		Home.click();
		Deals.click();
		
	}
	public void logout() {
		setting.click();
		Logout.click();
	}

}
	
	

