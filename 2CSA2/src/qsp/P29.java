package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class P29 {
static int count;
       static {
   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
       public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		System.out.println("1st page title: "+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		while(true) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(Exception e) {
       System.out.println("logout link is still not loaded," + "will find again for the "+(count++)+" time");
			}
			}	
		driver.close();
		}
}
