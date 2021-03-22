package qsp;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		//1. convert webdriver to takesscreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		//2. screenshot is stored in ram
		File src = ts.getScreenshotAs(OutputType.FILE);
		//3. created and specified the path of permanent file
		File des = new File("./photo/facebookSS.png");
		//4. copy pasting from ram to permanent file
		FileUtils.copyFile(src, des);
		Thread.sleep(3000);
		driver.close();
	}

}
