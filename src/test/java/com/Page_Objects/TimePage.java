package com.Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import com.utils.CommonUtils;

public class TimePage {
private  static TimePage TimeInstance;
private TimePage() {
	
}
public static TimePage	getInstance() {
	if(TimeInstance==null) {
		TimeInstance=new TimePage();
	}
	return TimeInstance;
}
@FindBy(linkText = "Time")
private WebElement TIME;

@FindBy(id="employee")
private WebElement EmployeeName;

@FindBy(id="btnView")
private WebElement VIEWButton;
@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]")
private WebElement Message;

@FindBy(id="btnAddTimesheet")
private WebElement AddTimeSheet;
@FindBy(xpath="//input[@id='time_date']")
private WebElement CreateTimeSheet;

@FindBy(xpath="//input[@id='addTimesheetBtn']")
private WebElement ClickTimeSheet;


@FindBy(xpath="//input[@id='btnSubmit']")
private WebElement SubmitTimeSheet;

@FindBy(xpath="//textarea[@id='txtComment']")
private WebElement CommentApproval;

@FindBy(xpath="//input[@id='btnApprove']")
private WebElement clickApprove;

@FindBy(xpath="//a[@id='btnAddTimesheet']")
private WebElement AddTimeSheetButton;

public void getEmployeeName(String name) {
	EmployeeName.click();
	EmployeeName.sendKeys(name);
}

public void getView() {
	VIEWButton.click();
}
public String getMessage() {
	return Message.getText();
	
}
public void AddSheet() {
	AddTimeSheet.click();
	if(AddTimeSheet.isSelected()) {
		
	}
	else {
	AddTimeSheetButton.click();
	}
}


  public void AddTimeSheets(String Enterdate) { CreateTimeSheet.clear();
  CreateTimeSheet.sendKeys(Enterdate); CreateTimeSheet.click();
  ClickTimeSheet.click(); SubmitTimeSheet.click();
  CommentApproval.sendKeys("Approve this TimeSheet what i mentioned");
  clickApprove.click();
  
  }
 }

