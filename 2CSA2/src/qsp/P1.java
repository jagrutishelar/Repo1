package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			driver.close();

		}

	
}
