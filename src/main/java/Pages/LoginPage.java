package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;

public  class LoginPage extends TestBase{
	
	@FindBy(xpath  = "//input[@id ='identifierId']")
	static
	WebElement username;
	
	
	
	@FindBy(name = "password")
	static
	WebElement password;
	
	
	
	@FindBy(xpath ="//span[contains(text(),'Next')]")
	static
	WebElement Login;
	
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
public static HomePage login(String un , String pw) throws InterruptedException
{
	username.sendKeys(un);
	Login.click();
	password.sendKeys(pw);
	Thread.sleep(1000);
	Login.click();
	
	return new HomePage();
	
}





}
