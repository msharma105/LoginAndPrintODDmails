package gmailTest;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends TestBase{
   
	LoginPage loginpage;
	HomePage homepage;
	public HomePageTest() throws FileNotFoundException//to load properties
	{
		BaseTest();
	}
	@BeforeMethod
	
	public void setup() 
	{
		
		TestBase.initialization();  //to initialize browser
		loginpage = new LoginPage();
		try {
		homepage= LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@Test()
	public void HomePageTestload() throws InterruptedException
	{
		String s1 =HomePage.ValidateHomepageloaded();
		Assert.assertEquals(s1, "Inbox");
	}
		//Assert.assertEquals((homepage.printtext()), true);
	
	@AfterMethod
	public void teardown()
	{
		HomePage.printtest();
		driver.quit();
	}
}
