package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	
	// Create object repository by using POM design with PageFactory
	@FindBy(name="email")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement login;
	
	// initiate Object repository by PageFactory.initElements()method in constructor
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// create non static associated methods for each and every object repository
	
	public void loginFunctionality(String UserName, String Password)
	{
		userName.sendKeys(UserName);
		password.sendKeys(Password);
		login.click();
	}

}
