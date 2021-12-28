package com.Step_def;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import com.Page_Objects.DirectoryPage;
import com.Page_Objects.HomePage;
import com.Page_Objects.LoginPage;
import com.WebDriver_Manager.Driver_Manager;
import com.constant.Constants;
import com.utils.CommonUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_CEO_Name {
	static final Logger LOGGER=LogManager.getLogger(Verify_CEO_Name .class);
	@Given("the user is logged in successfully and is on home page")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() {
		try {
			Driver_Manager.getDriver().get(Constants.APP_URL);

			LoginPage.getInstance().enterUsername(Constants.Username);
			LoginPage.getInstance().enterPassword(Constants.Password);
			LoginPage.getInstance().clickButton();
			String url=Driver_Manager.getDriver().getCurrentUrl();
			if(url.contains("dashboard")) {
				LOGGER.info("the user is logged in successfully and is on home page");
			}

		}
		catch(Exception e) {
			LOGGER.error(e);
		CommonUtils.getInstance().takeScreenshot();
		}

	}

	@When("the user clicks on the directory option from the menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
		try {
			HomePage.getInstance().getDirectory();
			LOGGER.info("the user clicks on the directory option from the menu bar");
		}
		catch(Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}




	}

	@And("the user select the job title as {string} from the drop down")
	public void the_user_select_the_job_title_as_from_the_drop_down(String Title) {
		try {
			Select Job=new Select(DirectoryPage.getInstance().getJOB_TITLE());
			Job.selectByVisibleText(Title);

			LOGGER.info("the user select the job title as {string} from the drop down"); 
		}
		catch(Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	}
	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String expectedName) {

		try {
			String actualName=DirectoryPage.getInstance().getCEO_NAME().getText();

			if(actualName.equalsIgnoreCase(expectedName))
			{
				LOGGER.info("the user should see the CEO name as John Smith");
			}
		}
		catch(Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();		}
	}


	@And("clicks the search button")
	public void clicks_the_search_button() {
		try{DirectoryPage.getInstance().getSEARCH().click();
		//DirectoryPage.SEARCH.click(); 
		LOGGER.info("clicks the search button");
		}
		catch(Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
		}}


	
}
