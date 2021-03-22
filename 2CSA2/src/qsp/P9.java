package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.fb.com");
		Thread.sleep(2000);
		WebElement emailTB = driver.findElement(By.name("email"));
		emailTB.sendKeys("***********");
		Thread.sleep(2000);
		WebElement pwtb = driver.findElement(By.id("pass"));
		pwtb.sendKeys("**********");
		Thread.sleep(2000);
		WebElement LoginBtn = driver.findElement(By.name("login"));
		LoginBtn.click();
	
	}

}
