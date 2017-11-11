package com.scp.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.scp.practiceForm.ToolsQAPracticeForm;

public class AppBrowserInitilzations {
	
	public static WebDriver initilizeBrowsers(){
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("log", "{level: trace}");//lOG4j
		capabilities.setCapability("marionette", true);
		capabilities.setCapability("moz:firefoxOptions", options);
		
		System.setProperty("webdriver.gecko.driver","E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogesh\\Downloads\\chromedriver_win32");
		
		//WebDriver driver = new FirefoxDriver();
		return new FirefoxDriver();
	}
	
	public static ToolsQAPracticeForm enterUrl(String appUrl){
		WebDriver driver  = initilizeBrowsers();
		driver.get(appUrl);
		ToolsQAPracticeForm practiceFormPO = 
					PageFactory.initElements(driver, ToolsQAPracticeForm.class);
		return practiceFormPO;
	}

	
	
}
