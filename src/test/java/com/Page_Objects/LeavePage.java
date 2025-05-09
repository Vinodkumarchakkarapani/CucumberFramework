package com.Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonUtils;

public class LeavePage {
	private static LeavePage LeaveInstance;
	private LeavePage() {
		
	}
	public static LeavePage getInstance() {
		if(LeaveInstance==null) {
			LeaveInstance=new LeavePage();
		}
		return LeaveInstance;
		
	}

	
	  @FindBy(linkText="Leave") private WebElement LeaveList;
	 
	@FindBy(xpath="//input[@id='calFromDate']")
private WebElement FromDate;
@FindBy(xpath="//input[@id='calToDate']")
private WebElement ToDate;
@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
private WebElement LeaveStatus;
@FindBy(xpath="//input[@name='leaveList[txtEmployee][empName]']")
private WebElement EmployeeLeaveName;
@FindBy(xpath="//select[@id='leaveList_cmbSubunit']")
private WebElement SubUnits;
@FindBy(xpath="//input[@type='button']")
private WebElement SearchLeaveButton;

public void ClickLeave() {
	LeaveList.click();
}


 

 public void FromDates(String DateFrom) {
 //CommonUtils.getInstance().highlightElement(FromDate); FromDate.click();
 FromDate.sendKeys(DateFrom); }
 
  public void ToDates(String DateTo) { ToDate.click(); ToDate.sendKeys(DateTo);
  
  }
  
  public void Leavestatus() { LeaveStatus.click(); } public void
  EmployeelName(String empname) { EmployeeLeaveName.sendKeys(empname); }
  
  public WebElement Subunits() { return SubUnits; }
  
  public void ClickSearchBtn() { SearchLeaveButton.click(); }
 
}