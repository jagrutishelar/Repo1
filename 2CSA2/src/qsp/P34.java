package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class P34 {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		
		//driver.findElement(By.name("q")).sendKeys("java");//1-line
		
		/*
		 * WebElement googleTB = driver.findElement(By.name("q"));//2-lines
		 * googleTB.sendKeys("java");
		 */
		
		//3-lines
		WebElement googleTB;//declaration
		googleTB = driver.findElement(By.name("q"));//initialization
		googleTB.sendKeys("java");//utilization
		
		Thread.sleep(3000);
		driver.close();
	}

}
