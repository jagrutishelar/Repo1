package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.naukri.com");
		String NaukriAddress = driver.getWindowHandle();
		System.out.println(NaukriAddress);
		System.out.println("=============================");
		Set<String> allAddresses = driver.getWindowHandles();
		System.out.println(allAddresses.size());
		driver.close();
		

	}

}
