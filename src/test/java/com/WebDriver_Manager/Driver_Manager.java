package com.WebDriver_Manager;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.constant.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Manager {
	private static final Logger LOGGER=LogManager.getLogger(Driver_Manager.class);
	private static WebDriver driver =null;
	private static ExtentReports extentReports;
	private static ExtentSparkReporter htmlReports;
	public static void launchBrowser() {
  
		extentReports=new ExtentReports();	
		htmlReports=new ExtentSparkReporter("target/Spark.html");
		extentReports.attachReporter(htmlReports);
		extentReports.flush();
   
	try
	{
		 
	switch (Constants.BROWSER) {
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		LOGGER.info("Launching "+Constants.BROWSER);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().getCookies();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		break;
	case "chrome":
		WebDriverManager.chromedriver().setup();
		LOGGER.info("Launching "+Constants.BROWSER);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().getCookies();
		
		break;
	case "IE": 
		WebDriverManager.iedriver().setup();
		LOGGER.info("Launching "+Constants.BROWSER);
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		//driver.manage().getCookies();
		
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		LOGGER.info("Launching "+Constants.BROWSER);
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	//driver.manage().getCookies();
	
	default:
		WebDriverManager.firefoxdriver().setup();
		LOGGER.info("Launching "+Constants.BROWSER);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().getCookies();
		break;
	}	
	}
	catch(Exception e){
	e.printStackTrace();	
	}// TODO Auto-generated method stub
	}
	public static WebDriver getDriver() {
		return driver;
	
	}
}

