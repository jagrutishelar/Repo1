package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class NotificationPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("qWERWERWR");
		driver.findElement(By.id("pass")).sendKeys("W3RW3R");
		driver.findElement(By.xpath("//button[.='Log In']")).click();
	}

}
