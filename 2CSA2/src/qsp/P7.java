package qsp;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String wh :allWindowHandles) {
			System.out.println(wh);
		}
		System.out.println("No of addresses: "+allWindowHandles.size());
		driver.quit();
	}

}
