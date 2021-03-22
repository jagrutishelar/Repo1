package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(3000);
		driver.findElement(By.id("policynumber")).sendKeys("765ABCD");
		Thread.sleep(3000);
		driver.findElement(By.id("dob")).click();//we get calendar popup
		WebElement monthLB = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 = new Select(monthLB);
		s1.selectByVisibleText("Mar");
		Thread.sleep(3000);
		WebElement yearLB = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 = new Select(yearLB);
		s2.selectByVisibleText("1994");
		Thread.sleep(3000);
		driver.findElement(By.linkText("18")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("alternative_number")).sendKeys("9343587756");
		Thread.sleep(3000);
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
