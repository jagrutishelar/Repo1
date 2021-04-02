package actiassign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.id("container_reports")).click();
		driver.findElement(By.id("ext-gen30")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ext-gen179")).click();
		driver.findElement(By.id("applyReportConfiguration")).click();
		driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Est vs Act Time");
		driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
