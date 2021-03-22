package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/2CSA2/M.html");
		//driver.findElement(By.id("t1")).sendKeys("ABCDEFGHIJKLMNOP");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('t1').value='ABCD'");
		Thread.sleep(3000);
		driver.close();

	}

}
