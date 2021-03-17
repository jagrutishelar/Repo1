package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P12 {
	static {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
		}
	
	@Test
	public void testApp() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String expectedTitle = "boooooogle";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
			Assert.fail();//
		}
		
		driver.close();
		System.out.println("THE END");
	}

}
