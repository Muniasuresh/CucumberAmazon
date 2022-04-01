package com.cts.automation.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

@FindBy(xpath="//input[@id='twotabsearchtextbox']")
public WebElement SearchTxt;



public void login(String searchtxt )
{
	SearchTxt.sendKeys(searchtxt);
	

}
}
