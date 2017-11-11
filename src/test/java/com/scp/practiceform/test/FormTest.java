package com.scp.practiceform.test;

import org.testng.annotations.Test;

import com.scp.practiceForm.ToolsQAPracticeForm;
import com.scp.utilities.AppBrowserInitilzations;
import com.scp.utilities.AppConstants;
import com.scp.utilities.AppConstants.AutomationTools;
import com.scp.utilities.AppConstants.SkillSet;

public class FormTest {
 
	
@Test
  public void fillToolsQAPracticeForm() {
	ToolsQAPracticeForm practiceFormPO = AppBrowserInitilzations.enterUrl(AppConstants.APPLICATION_URL);
	practiceFormPO.enterYourName("AAAA", "BBB");
	practiceFormPO.selectGender("Male");
	practiceFormPO.selectExp("7");
	practiceFormPO.selectExp(SkillSet.AUTOMATION,SkillSet.MANUALTESTER);
	practiceFormPO.selectExp(AutomationTools.QTP,AutomationTools.SELENIUM,AutomationTools.IDE);
  }

/**
 * WebDriver driver =new FirefoxDriver();
		driver.get("toolsqa url");
		WebElement firstNameInput=driver.findElement(By.name("firstName"));
		WebElement lastNameInput=driver.findElement(By.name("lastname"));
		
		firstNameInput.sendKeys("aaaa");
		lastNameInput.sendKeys("qqqqqqqqq");
		
 * 
 */


	
	
}
