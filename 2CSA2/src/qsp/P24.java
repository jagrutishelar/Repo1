package qsp;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P24 {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/2CSA2/J.html");
		WebElement tajListBox = driver.findElement(By.id("taj"));	
		Select s1 = new Select(tajListBox);
		s1.selectByIndex(0);//vadapav
		Thread.sleep(2000);
		s1.selectByValue("td");//tandoori
		Thread.sleep(2000);
		s1.selectByVisibleText("IDLY");//idly
		Thread.sleep(2000);
//		s1.deselectByIndex(3);//deselect idly
//		Thread.sleep(2000);
//		s1.deselectByVisibleText("TANDOORI");//deselect tandoori
//		Thread.sleep(2000);
//		s1.deselectByValue("vp");//deselect vadapav
		List<WebElement> allselOptions = s1.getAllSelectedOptions();
	System.out.println("First selected option:"+s1.getFirstSelectedOption().getText());
		System.out.println("All selected options:");
		for(int i=0;i<allselOptions.size();i++) {
			System.out.println(allselOptions.get(i).getText()); }
		System.out.println("All Options of the List Box:");
		List<WebElement> allOptions = s1.getOptions();
		for(int j=0;j<allOptions.size();j++) {
			System.out.println(allOptions.get(j).getText());  }
		s1.deselectAll();
		System.out.println(s1.isMultiple());//true
		Thread.sleep(2000);
		driver.close();	
	} 
}
