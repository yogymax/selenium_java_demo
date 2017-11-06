package com.scp.utilities;

public class Remarks {
	
	/**
	 * Configure maven
	 * 		Download apache maven 3.3.9
	 * 		Copy path before bin folder
	 * 		Add following Environment variables
	 * 			MAVEN_HOME = C:\APACEHMAVEN3.3.9\
	 * 			path = ;%MAVEN_HOME%bin
	 * 		Open fresh command promt - cmd
	 * 		>mvn  (Output should be build failure)
	 * 		Navigate to users directory
	 * 		.m2 folder should be created in which repository folder shud be present 
	 * 		Copy settings.xml - either from net..take it from me
	 * 		
	 * 		Create MAven project instead of java project	
	 * 		Select maven-archtype-quickstart
	 * 			Specify GroupId  --- This project belongs to which account/group
	 * 			Specify artifcat Id --- Your project name
	 * 			Specify version ---it's a project version
	 * 	
	 * Project Structure
	 * 		ProjectName
	 * 			src/main/java -- in which you should write business logic/Pageobjects
	 * 			src/test/java -- in which you should write testing logic/Test cases
	 * 			jre --- jre libraries
	 * 			maven dependencies  --- jars that you specified inside pom.xml
	 * 			src  -- compiled source file
	 * 			target -- your project jar file will get created
	 * 			pom.xml  -- Project object model
	 * 		
	 * To configure Selenium
	 * 		Search -- maven dependency for selenium
	 * 					Copy entire
	 * 				Dependency should be under inside pom.xml's dependencies tag 		
	 * 				Add repository inside Settings.xml--(users directory/.m2/)
	 * 
	 * similarly Add Testng Dependency-
	 * 
	 * 
	 * 
	 * If selenium version is less than 3 -- firefox should be installed <=47
	 * if selenium version is greater than or equal to 3 -- you should have firefox greater that 54
	 * 
	 * If selenium less than 3 == (FireFox is default for selnium <3)
	 * 	No need to system propery for firefox but other browsers yes you need to set system property
	 * 
	 * selenium >3 == no default browser -- yes system property for every browser even for firefox
	 * 
	 * Download related driverfile for internet and get the property name --key through error message
	 * must be set before creating instance of an driver
	 * 
	 * 
	 * run and check basic configuration are working fine or not
	 * 
	 * Inspect the elements on page
	 * 		1... Firebug -- firefox plugins
	 * 		2... Firepath-- Firefox plugins
	 * 		3... Manually -- for other browser you need to explicity identify/inspect element
	 * 
	 * 
	 * 
	 */

	
	
	
	
	
	
	
	
}
