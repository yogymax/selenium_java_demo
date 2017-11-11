package com.scp.utilities;

public class AppConstants {
	
	public static String APPLICATION_URL="http://toolsqa.com/automation-practice-form/";

	public enum SkillSet {
		AUTOMATION("Automation Tester"), MANUALTESTER("Manual Tester");
		private String value;
		SkillSet(String p) {
			value = p;
		}
		public String getValue() {
			return value;
		}
	}
	
	
	public enum AutomationTools {
		IDE("Selenium IDE"),SELENIUM("Selenium Webdriver"),QTP("QTP");
		private String value;
		AutomationTools(String p) {
			value = p;
		}
		public String getValue() {
			return value;
		}
	}
	
}
