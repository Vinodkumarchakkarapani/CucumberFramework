package com.Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {
	private static DirectoryPage directoryInstance;
	private DirectoryPage() {
		
	}
	public static DirectoryPage getInstance() {
		if(directoryInstance==null) {
			directoryInstance=new DirectoryPage();	
		}
		return directoryInstance;
		
	} 
	//@FindBy(xpath = "//ul[@id='mainMenuFirstLevelUnorderedList']/li/a/b[contains(text(),'Directory')")
//@FindBy(xpath="//*[(@id,'searchDirectory_job_title')]")
//@FindBy(xpath="//*[@id='searchDirectory_job_title'][@name='searchDirectory[job_title]' ")
	@FindBy(id="searchDirectory_job_title")
	private WebElement JOB_TITLE;
	

	@FindBy(id="searchBtn")
	private WebElement SEARCH;
   
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/table/tbody/tr[2]/td[2]/ul/li[1]/b")
    private WebElement CEO_NAME;
    
    public WebElement getJOB_TITLE() {
	return JOB_TITLE;
}

    public WebElement getSEARCH() {
	return SEARCH;
}

    public WebElement getCEO_NAME() {
	return CEO_NAME;
}
}
