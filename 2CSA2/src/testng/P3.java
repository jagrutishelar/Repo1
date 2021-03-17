package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P3 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver;
	@Test(priority=1)
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
	@Test(priority=2)
	public void testApp() {
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		Reporter.log(title,true);
	}
	@Test(priority=3)
	public void closeApp() {
		driver.close();
	}



}
