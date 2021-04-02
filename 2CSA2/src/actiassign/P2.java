package actiassign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.id("container_reports")).click();
		driver.findElement(By.id("ext-gen128")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='arrow'])[11]")).click();
		driver.findElement(By.id("ext-gen320")).click();
		driver.findElement(By.xpath("//span[@title='Users Without Department']")).click();
		driver.findElement(By.id("ext-comp-1262")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createChartLightbox_commitBtn")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("createChartLightbox_downloadPdfBtn")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
