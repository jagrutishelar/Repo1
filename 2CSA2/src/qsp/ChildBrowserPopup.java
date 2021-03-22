package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String wh:allWindowHandles) {
			if(parentWindow.equals(wh)) {
				continue;
			}
			else {
				driver.switchTo().window(wh).close();
				Thread.sleep(2000);
			}
		}
	}
}
