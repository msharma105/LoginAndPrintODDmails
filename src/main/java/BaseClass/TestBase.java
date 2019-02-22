package BaseClass;
import  Utility.Timeout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public  void BaseTest() throws FileNotFoundException {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(
					"config.properties");
			prop.load(file);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static WebDriver initialization() {
		String browsername = prop.getProperty("browser");
		
		
			if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.out.println("no browser available");
			}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Timeout.PAGE_LOAD_TIMEOUT ,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Timeout.Implicit_Wait, TimeUnit.SECONDS);
		
		return driver;

	}

	

}
