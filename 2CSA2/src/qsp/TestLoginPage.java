package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername("Dinga");
		l1.setPassword("Dingi");
		l1.clickLogin();//page gets refreshed
		
		l1.setUsername("Jhinga");//StaleElementReferenceException	
		l1.setPassword("Jhingi");
		l1.clickLogin();
		l1.setUsername("sundra");//StaleElementReferenceException	
		
		
		l1.setPassword("sundri");
		l1.clickLogin();
		l1.setUsername("admin");//StaleElementReferenceException	
		l1.setPassword("manager");
		l1.clickLogin();
		Thread.sleep(10000);
		driver.close();	
	}
}
