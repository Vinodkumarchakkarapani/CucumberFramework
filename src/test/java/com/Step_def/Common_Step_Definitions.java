package com.Step_def;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import com.WebDriver_Manager.Driver_Manager;
//import com.constant.Constants;
import com.utils.CommonUtils;

import io.cucumber.java.Before;

public class Common_Step_Definitions {

	
	 private static final Logger LOGGER=LogManager.getLogger(Common_Step_Definitions.class);
	@Before
	public void before_scenario() {
		LOGGER.info("Execution started");
		try {
			LOGGER.info("Instantiation the commonutils ");	
			
		LOGGER.info("Loading the properties file");
			CommonUtils.getInstance().loadproperties();
			LOGGER.info("checking the driver is null or not ");
			if(Driver_Manager.getDriver()==null) {
				LOGGER.info("driver  is null instanting ");
			Driver_Manager.launchBrowser();
			CommonUtils.getInstance().InitialElements();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

		
	}

