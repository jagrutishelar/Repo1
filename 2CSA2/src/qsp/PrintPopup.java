package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PrintPopup {
static {
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");  }
public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);	
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);	
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_C);
		r1.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_5);
		Thread.sleep(3000);	
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(5000);
		driver.close();
		}
   }
