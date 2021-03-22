package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P22 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//go to google
		driver.get("http://www.google.com");
		//entering 'java' in the search box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);//this is very important
		//print count of all autosuggestion
		List<WebElement> allAutoSuggestions = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		System.out.println("Count: "+allAutoSuggestions.size());
		//print all autosuggestions
		for(int i=0;i<allAutoSuggestions.size();i++) {
			System.out.println(allAutoSuggestions.get(i).getText());
		}
		//click on third autosuggestion
		allAutoSuggestions.get(2).click();
		Thread.sleep(5000);
		driver.close();
	}
}
