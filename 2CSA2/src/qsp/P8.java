package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class P8 {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/2CSA2/B.html");
		Thread.sleep(2000);
		WebElement untb = driver.findElement(By.id("a1"));
		untb.sendKeys("Dinga");
		Thread.sleep(2000);
		WebElement pwtb = driver.findElement(By.id("a2"));
		pwtb.sendKeys("1234567890");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.id("a3"));
		checkbox.click();
		Thread.sleep(5000);
		WebElement FPLink = driver.findElement(By.id("a4"));
		FPLink.click();
		Thread.sleep(5000);
		driver.close();
	}
}
