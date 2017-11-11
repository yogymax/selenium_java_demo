package com.scp.practiceForm;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.scp.utilities.AppConstants.AutomationTools;
import com.scp.utilities.AppConstants.SkillSet;
/**
 * 
 * @author Yogesh
 *
 */
public class ToolsQAPracticeForm {
	
	@FindBy(name="firstname")
	WebElement firstNameInput;
	
	@FindBy(name="lastname")
	WebElement lastNameInput;
	
	@FindBy(name="sex")
	List<WebElement> gender;

	@FindBy(name="exp")
	List<WebElement> yearOfExp;

	@FindBy(id="datepicker")
	WebElement dateInput;
	
	@FindBy(name="profession")
	List<WebElement> profession;
	
	@FindBy(name="tool")
	List<WebElement> automationTool;
	
	@FindBy(tagName="select")
	List<WebElement> allLists;
	
	
	
	/**
	 * 
	 * @param fName
	 * @param lName
	 */
	public void enterYourName(String fName,String lName){
		firstNameInput.clear();
		firstNameInput.sendKeys(fName);
		
		lastNameInput.clear();
		lastNameInput.sendKeys(lName);
		
		dateInput.clear();
		dateInput.sendKeys("121313213");
		
	}
	
	
	
	public void selectGender(String genderVal){
		boolean isGenderSelected =false;
		for(WebElement item :gender){
			if(item.getAttribute("value").equals(genderVal)){
				item.click();
				isGenderSelected=true;
				break;
			}
		}
		Assert.assertTrue(isGenderSelected,"Invalid gender type...!");
	}
	
	
	public void selectExp(String noOfYearExp){
		boolean isYearOfExpSelected =false;
		for(WebElement item :yearOfExp){
			if(item.getAttribute("value").equals(noOfYearExp)){
				item.click();
				isYearOfExpSelected=true;
				break;
			}
		}
		Assert.assertTrue(isYearOfExpSelected,"Invalid Exp type...!");
	}
	
	
	
	public void selectExp(SkillSet ...skills){
		//Skills - Manual Tester Automation Tester
		int count=0;
		for (SkillSet skill : skills) {
			for(WebElement item :profession){
				if(item.getAttribute("value").equals(skill.getValue())){
					item.click();
					count++;
					break;
				}
			}
			
			
		}
		
		Assert.assertEquals(skills.length,count);
	}
	
	
	
	
	public void selectExp(AutomationTools ...tools){
		int count=0;
		for (AutomationTools tool : tools) {
			for(WebElement item :automationTool){
				if(item.getAttribute("value").equals(tool.getValue())){
					item.click();
					count++;
					break;
				}
			}
			
			
		}
		
		Assert.assertEquals(tools.length,count);
	}
}
