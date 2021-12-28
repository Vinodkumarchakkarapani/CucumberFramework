package com.Step_def;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import com.Page_Objects.DirectoryPage;
import com.Page_Objects.HomePage;
import com.Page_Objects.LeavePage;
//import com.Page_Objects.HomePage;
import com.WebDriver_Manager.Driver_Manager;
import com.utils.CommonUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Pending_Leave {
	static final Logger LOGGER=LogManager.getLogger(Verify_Pending_Leave.class);
	@Given("user should be fill the leave list")
	public void user_should_be_fill_the_leave_list() {
		try {
		String url=Driver_Manager.getDriver().getCurrentUrl();
		LeavePage.getInstance().ClickLeave();
		//HomePage.getInstance().getTime();
		if(url.contains("dashboard")) { 
			  LOGGER.info("the user is on homepage");
			  
			  }
		
	    }
		catch(Exception e) {
			LOGGER.error(e);
		CommonUtils.getInstance().takeScreenshot();
		}
		}


  @When("user should be select from date {string} and to date {string}") public
  void user_should_be_select_from_date_and_to_date(String frdate,String Tdate)
  { try {
  
  LeavePage.getInstance().FromDates(frdate);
  LeavePage.getInstance().ToDates(Tdate);
  
  } catch(Exception e) { LOGGER.error(e);
  CommonUtils.getInstance().takeScreenshot(); }
  
  }
  
  @And("Check the leave status") public void check_the_leave_status() { try {
  LeavePage.getInstance().Leavestatus();
  
  } catch(Exception e) { LOGGER.error(e);
  CommonUtils.getInstance().takeScreenshot(); }
  
  
  
  
  }
  
  @When("enter the employee name {string}") public void
  enter_the_employee_name(String ename){ try {
  LeavePage.getInstance().EmployeelName(ename);
  
  } catch(Exception e) { LOGGER.error(e);
  CommonUtils.getInstance().takeScreenshot(); }
  
  
  
  
  }
  
  @And("Select the SubUnit") public void select_the_sub_unit(String TTitle) {
  try { Select Jobe=new Select(LeavePage.getInstance().Subunits());
  Jobe.selectByVisibleText(TTitle);
  
  } catch(Exception e) { LOGGER.error(e);
  CommonUtils.getInstance().takeScreenshot(); }
  
  
  
  
  }
  
  @Then("Click the SearchButton") public void click_the_search_button() { try {
  LeavePage.getInstance().ClickSearchBtn();
  
  } catch(Exception e) { LOGGER.error(e);
  CommonUtils.getInstance().takeScreenshot(); }
  
  
  
  
  } }
 
