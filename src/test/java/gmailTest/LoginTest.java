package gmailTest;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.CustomListener;
import BaseClass.TestBase;
import ExtentReports.ExtentReporterNG;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest  extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginTest() throws FileNotFoundException//to load properties
	{
		BaseTest();
	}
	
	@BeforeMethod
	
	public void setup() 
	{
		
		TestBase.initialization();  //to initialize browser
		loginpage = new LoginPage();
		try {
			LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
