package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P25 {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/2CSA2/J.html");
		WebElement paramountListBox = driver.findElement(By.id("paramount"));
		Thread.sleep(2000);
		Select s1 = new Select(paramountListBox);
		s1.selectByValue("h");
		Thread.sleep(2000);
		s1.selectByIndex(0);
		Thread.sleep(2000);
s1.deselectByIndex(0);//UnsupportedOperationException: - cannot deselect a single select listbox
		driver.close();
	}
}
