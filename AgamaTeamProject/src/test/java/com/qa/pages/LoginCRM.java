package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCRM {
	WebDriver driver;
	@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']")
	WebElement Login;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement Loginbutton;
	@FindBy(xpath="//i[@class='settings icon']")
	WebElement setting;
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	WebElement Logout;
	
	
	public LoginCRM(WebDriver wdriver) {
		this.driver=wdriver;
		PageFactory.initElements(driver,this);
	}
	public void login() {
		Login.click();
	}
	public void Email(String ema,String PW) {
		email.sendKeys(ema);
		password.sendKeys(PW);
	}
	public void Lbutton() {
		
		Loginbutton.click();
		
	}
	public void logout() {
		setting.click();
		Logout.click();
	}

}
