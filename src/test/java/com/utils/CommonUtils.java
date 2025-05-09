package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Page_Objects.DirectoryPage;
import com.Page_Objects.HomePage;
import com.Page_Objects.LeavePage;
import com.Page_Objects.LoginPage;
import com.Page_Objects.TimePage;
import com.WebDriver_Manager.Driver_Manager;
import com.constant.Constants;

public class CommonUtils {
	private static CommonUtils commonUtilsInstance=null;
	private CommonUtils() {
		
	}
	public static CommonUtils getInstance() {
		if(commonUtilsInstance==null) {
			commonUtilsInstance=new CommonUtils();
		}
		return commonUtilsInstance;
		
		
		
	}
public  void loadproperties() {
	Properties properties= new Properties();

	try {
		properties.load(getClass().getResourceAsStream("/config.properties"));
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
Constants.APP_URL=properties.getProperty("APP_URL");
Constants.BROWSER=properties.getProperty("BROWSER");
Constants.Username=properties.getProperty("Username");
Constants.Password=properties.getProperty("Password");
Constants.Firefox_Driver_Location=properties.getProperty("Firefox_Driver_Location");
Constants.Chrome_Driver_Location= properties.getProperty("Chrome_Driver_Location");
Constants.IE_Driver_Location=properties.getProperty("IE_Driver_Location");
Constants.EnterDate=properties.getProperty("EnterDate");
Constants.CEOname=properties.getProperty("CEOname");
Constants.FromDate=properties.getProperty("FromDate");
Constants.ToDate=properties.getProperty("ToDate");
Constants.EmployeeLeaveName=properties.getProperty("EmployeeLeaveName");
}
public void InitialElements() {
PageFactory.initElements(Driver_Manager.getDriver(),LoginPage.getInstance());
PageFactory.initElements(Driver_Manager.getDriver(),HomePage.getInstance());
PageFactory.initElements(Driver_Manager.getDriver(),DirectoryPage.getInstance());
PageFactory.initElements(Driver_Manager.getDriver(),TimePage.getInstance());
PageFactory.initElements(Driver_Manager.getDriver(),LeavePage.getInstance());
}
public void takeScreenshot() {
	File screenshot = ((TakesScreenshot)Driver_Manager.getDriver()).getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(screenshot, new File("./Screenshots/Image2.png"));
}
	catch(IOException e) {
		System.out.println(e.getMessage());
		
	}
}

public void highlightElement(WebElement element) { JavascriptExecutor
	executer=(JavascriptExecutor) Driver_Manager.getDriver(); executer.
	executeScript("arguments[0].setAttribute('style','border: 3px solid red');",element); 
}
 }  
