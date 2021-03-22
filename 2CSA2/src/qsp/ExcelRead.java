package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

public static void main(String[] args) throws InterruptedException, EncryptedDocumentException,
FileNotFoundException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String usn = wb.getSheet("Actitime").getRow(5).getCell(0).toString();
		driver.findElement(By.id("username")).sendKeys(usn);//admin
		
		Thread.sleep(3000);
		
		String pwd = wb.getSheet("Actitime").getRow(5).getCell(1).toString();
		driver.findElement(By.name("pwd")).sendKeys(pwd);//manager
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
