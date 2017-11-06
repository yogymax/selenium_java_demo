package com.scp.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class Demos {
	
	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("log", "{level: trace}");//lOG4j
		capabilities.setCapability("marionette", true);
		capabilities.setCapability("moz:firefoxOptions", options);
		
		System.setProperty("webdriver.gecko.driver","E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogesh\\Downloads\\chromedriver_win32");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		Thread.sleep(2000);
		
		WebElement loadBox = driver.findElement(By.id("load_box"));
		System.out.println(loadBox.getText());
		Thread.sleep(2000);
		WebElement name = loadBox.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/fieldset[1]/input"));
		WebElement phone=loadBox.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/fieldset[2]/input"));
		WebElement email=loadBox.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/fieldset[3]/input"));
		WebElement country= loadBox.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/fieldset[4]/select"));
		WebElement city=loadBox.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/fieldset[5]/input"));
		WebElement username=loadBox.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/fieldset[6]/input"));
		WebElement password=loadBox.findElement(By.xpath("/html/body/div[4]/div/div/div/div/form/fieldset[7]/input"));
		
		name.sendKeys("Abcdefgh");
		phone.sendKeys("1231231");
		email.sendKeys("abc@abc.com");
		city.sendKeys("Punnnnnnne");
		username.sendKeys("aaaaaaaa");
		password.sendKeys("adbaksda");
		
		Select countryNames = new Select(country);
		countryNames.selectByIndex(2);
		Thread.sleep(2000);
		countryNames.selectByVisibleText("Argentina");
		Thread.sleep(2000);
		countryNames.selectByValue("Armenia");
		
		
	}
	

}
