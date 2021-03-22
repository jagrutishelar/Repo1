package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class P11 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/2CSA2/B.html");
		driver.findElement(By.name("usn")).sendKeys("abcdefghijklmnop");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.className("rp")).click();
		Thread.sleep(6000);
		driver.close();
	}
}
