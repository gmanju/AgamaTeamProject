package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallsCRM {
WebDriver driver;
@FindBy(xpath="//span[contains(text(),'Calls')]")
WebElement calls; 
@FindBy(xpath="//a//button[@class='ui linkedin button']//i")
WebElement new1;
@FindBy(xpath="//div[contains(text(),'Search')]")
WebElement contacts;
@FindBy(xpath="//div[@name='type']")
WebElement type;
@FindBy(xpath="//span[contains(text(),'SKYPE')]")
WebElement skype;
@FindBy(xpath="//input[@name='duration']")
WebElement duration;
@FindBy(xpath="//input[@class='calendarField react-datepicker-ignore-onclickoutside']")
WebElement calltime;
@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--010']")
WebElement date;
@FindBy(xpath="//li[contains(text(),'21:45')]")
WebElement time;
@FindBy(xpath="//button[@class='ui linkedin button']")
WebElement save;
@FindBy(xpath="//span[contains(text(),'Home')]")
WebElement home;
@FindBy(xpath="//i[@class='settings icon']")
WebElement setting;
@FindBy(xpath="//span[contains(text(),'Log Out')]")
WebElement Logout;


public CallsCRM(WebDriver kdriver) {
	this.driver=kdriver;
	PageFactory.initElements(driver,this);
}
public void calls() {
	calls.click();
	new1.click();
}
public void info(String cont) {
	contacts.sendKeys(cont);
}
public void types() {
	type.click();
	skype.click();
	calltime.click();
	date.click();
	time.click();
}
public void dura(String dur) {
	duration.sendKeys(dur);
}
public void save() {
	save.click();
	home.click();
	calls.click();
}
public void logout() {
	setting.click();
	Logout.click();
}

}
