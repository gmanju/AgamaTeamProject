package com.qa.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	public static WebDriver driver;//class variables
	public static Properties prop;
	public static Logger log;
	
	public Library() {
		
		prop=new Properties();//local variables
		try {
			FileInputStream file= new FileInputStream("C:\\Users\\Aravind_2\\eclipse-workspace\\AgamaTeamProject\\src\\test\\resources\\ConfigProperties\\Config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log=Logger.getLogger(Library.class.getName());
		PropertyConfigurator.configure("C:\\Users\\Aravind_2\\eclipse-workspace\\AgamaTeamProject\\src\\test\\resources\\Log4jProperty\\Log4j.properties");
	
	}
	public void Browserlaunch(){
		String browser = prop.getProperty("browser");
		String url=prop.getProperty("url");
		switch(browser) {
		case "chrome" :
			log.info("LaunchChrome Application");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			log.info("LaunchFirefox Application");
			//log.debug("firefox");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "ie":
			log.info("LaunchIEdriver Application");
			//log.error("Internet Explorer");
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		}
	public void sreenshot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));
	}
	public void teardown() {
		driver.quit();
	}
			
		
		
}
	
	


