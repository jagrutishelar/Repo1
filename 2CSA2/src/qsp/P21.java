package qsp;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class P21 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("please enter Url");
		String url = src.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> allLinksOfAmazon = driver.findElements(By.xpath("//a"));
		System.out.println("No. of links: "+allLinksOfAmazon.size());
		
		for(int i=0;i<allLinksOfAmazon.size();i++) {
			System.out.println(allLinksOfAmazon.get(i).getText());
		}
		driver.close();
}

}
