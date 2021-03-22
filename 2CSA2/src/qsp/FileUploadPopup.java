package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/2CSA2/L.html");
		
		File f1 = new File("./cv/ABCD.docx");
		String s = f1.getAbsolutePath();
		System.out.println(s);
		Thread.sleep(5000);
		driver.findElement(By.id("a1")).sendKeys(s);
		Thread.sleep(5000);
		driver.close();

	}

}
