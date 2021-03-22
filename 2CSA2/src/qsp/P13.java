package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class P13 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/2CSA2/E.html");
//		driver.findElement(By.linkText("BHANUPRAKASHA")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("BHASHA")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
