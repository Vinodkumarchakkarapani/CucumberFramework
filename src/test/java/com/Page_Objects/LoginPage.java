package com.Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.CommonUtils;

public class LoginPage {
	private static LoginPage LoginInstance;
	private LoginPage(){
		
	}
	public static LoginPage getInstance() {
		if(LoginInstance==null) {
			LoginInstance=new LoginPage();
		}
		
		
		
		return LoginInstance;
		
	}
	
	@FindBy(id="txtUsername")
private WebElement USERNAME;
	@FindBy(id="txtPassword")
private WebElement PASSWORD;
	@FindBy(id="btnLogin")
private WebElement LOGIN_BUTTON;
	
/*
 * public WebElement getUSERNAME() { return USERNAME; } public WebElement
 * getPASSWORD() { return PASSWORD; } public WebElement getLOGIN_BUTTON() {
 * return LOGIN_BUTTON; }
 */
	public void enterUsername(String username) {
		CommonUtils.getInstance().highlightElement(USERNAME);
		USERNAME.sendKeys(username);
	}
public void enterPassword(String password) {
	CommonUtils.getInstance().highlightElement(PASSWORD);
	PASSWORD.sendKeys(password);
}
public void clickButton() {
	CommonUtils.getInstance().highlightElement(LOGIN_BUTTON);
LOGIN_BUTTON.click();	
}


}
