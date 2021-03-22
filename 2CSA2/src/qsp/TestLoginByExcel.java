package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginByExcel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		LoginPage l1 = new LoginPage(driver);
		
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for(int i=0;i<6;i++) {
			String usn = wb.getSheet("Actitime").getRow(i).getCell(0).toString();
			l1.setUsername(usn);
			Thread.sleep(1000);
			
			String pwd = wb.getSheet("Actitime").getRow(i).getCell(1).toString();
			l1.setPassword(pwd);
			Thread.sleep(1000);
			
			l1.clickLogin();
		}
		
		Thread.sleep(5000);
		driver.close();
		


		
	}

}
