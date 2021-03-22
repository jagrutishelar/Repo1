package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P23 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[]args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//go to google
		driver.get("http://www.cleartrip.com");
		//entering 'Ban' in the from search box
		Thread.sleep(6000);
		driver.findElement(By.name("origin")).sendKeys("ban");
		Thread.sleep(5000); // this is very important
		//print count of allautosuggestion
		List<WebElement> allAutoSuggestions = driver.findElements(By.xpath("a[contains(.,'Ban') and not (.='Bangalore')]"));
		System.out.println("Count : "+allAutoSuggestions.size());
		//print all auto-suggestions
		for(int i = 0; i<allAutoSuggestions.size() ; i++) {
			System.out.println(allAutoSuggestions.get(i).getText());
		}
		Thread.sleep(5000);
		//click on third auto suggestion
		allAutoSuggestions.get(0).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
