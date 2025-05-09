package com.Step_def;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.Page_Objects.HomePage;
import com.Page_Objects.LoginPage;
import com.Page_Objects.TimePage;
import com.WebDriver_Manager.Driver_Manager;
import com.constant.Constants;
import com.utils.CommonUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verify_TimeSheet_StepDef {
	 static final Logger LOGGER=LogManager.getLogger(Verify_TimeSheet_StepDef.class);
	@Given("the user is on the homepage")
	
	  public void the_user_is_on_the_homepage() { 
try {
String url=Driver_Manager.getDriver().getCurrentUrl();
	  
	  if(url.contains("dashboard")) { 
		  LOGGER.info("the user is on homepage");
		  }
	  }
catch(Exception e) {
	LOGGER.error(e);
	CommonUtils.getInstance().takeScreenshot();
}
	}

	@And("the user clicks on the time option from the menu")
	public void the_user_clicks_on_the_time_option_from_the_menu() {
		try {
		
		HomePage.getInstance().getTime();
		}
		catch(Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}

		 
		 	   
		}

	@And("the user enters the name as {string}")
	public void the_user_enters_the_name_as(String name) {
	try {
		TimePage.getInstance().getEmployeeName(Constants.CEOname);
	}
	catch(Exception e) {
		LOGGER.error(e);
		CommonUtils.getInstance().takeScreenshot();
	}

	}

	@And("clicks on view button")
	public void clicks_on_view_button() {
		try {
	TimePage.getInstance().getView();    
		}
		catch(Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}
}
	@And("add the timesheet")
	public void add_the_timesheet() {
	    try {
	    	TimePage.getInstance().AddSheet();
	    }
	catch(Exception e) {
		LOGGER.error(e);
		CommonUtils.getInstance().takeScreenshot();
	}
	
	}
	
	@And("Create the timesheet")
	public void create_the_timesheet() {
		 try {
			 	
			 TimePage.getInstance().AddTimeSheets(Constants.EnterDate);
		    }
		catch(Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
	}

	}
	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String expectedMessage) {
	try {
		
		  String actualMessage=TimePage.getInstance().getMessage();
		  if(expectedMessage.equals(actualMessage)) {
		  LOGGER.info("expected message is seen"); }
		 }
	catch(Exception e) {
		LOGGER.error(e);
		CommonUtils.getInstance().takeScreenshot();
	}

	


	
	}

}
