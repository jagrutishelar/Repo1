package testng;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P7 {
	WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void testGoogle() {
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	@Test(priority=2)
	public void testFB() {
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
