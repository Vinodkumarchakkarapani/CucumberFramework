package com.Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import com.utils.CommonUtils;

public class HomePage {
	private static HomePage HomeInstance;
	private HomePage() {
		
	}
	public static HomePage getInstance() {
		if(HomeInstance==null) {
			HomeInstance=new HomePage();
		}
		return HomeInstance;
		
	}
	//@FindBy(xpath="//*[@id='menu_directory_viewDirectory'][@class='firstLevelMenu' ")
//@FindBy(xpath = "//*[contains(@id,'menu_direcmenu_directory_viewDirectorytory_viewDirectory')]")
@FindBy(linkText = "Directory")
	private WebElement DIRECTORY;
@FindBy(linkText = "Time")
private WebElement TIME;
@FindBy(linkText="Leave")
private WebElement LEAVE;
	
	/*
	 * public WebElement getDIRECTORY() { return DIRECTORY; }
	 */
	
	  public void getDirectory() { 
		  //CommonUtils.getInstance().highlightElement(DIRECTORY);
		  DIRECTORY.click(); }
	 
	  public void getTime() {
			//CommonUtils.getInstance().highlightElement(
			TIME.click();
			LEAVE.click();
		}

}
