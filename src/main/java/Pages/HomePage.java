package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;

public class HomePage extends TestBase{
	
	

	
	@FindBy(xpath = "//tr[contains(@class,'zA')]")
	static
	List<WebElement> ls;
	@FindBy(xpath = "//div[contains(@class,'Tm')]")
	static
	WebElement mail;
	public  HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public static String ValidateHomepageloaded()
	{
		
		WebDriverWait wt = new WebDriverWait(driver,100);
	   WebElement s= wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/a[contains(text(),'Inbox')]")));
		return s.getText();

			
		
	}
	public static void printtest() {
	for (int i = 1; i < ls.size(); i += 2) {
		ls.get(i).click();
		System.out.print(mail.getText());
		driver.navigate().back();
	}}
	
}
