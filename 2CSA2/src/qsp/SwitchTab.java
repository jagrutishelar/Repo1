//SWITCH BETWEEN TAB
//nosuchwindow exception
package qsp;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchTab {
static { System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
}
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("http://demo.actitime.com/login.do");
String firstTab = driver.getWindowHandle();
   driver.findElement(By.linkText("actiTIME Inc.")).click();
   Thread.sleep(3000);
   Set<String> allTabs = driver.getWindowHandles();
for(String wh:allTabs)
if(firstTab.equals(wh))
{
continue; }
else
{
driver.switchTo().window(wh).close();
Thread.sleep(2000);
}
Thread.sleep(5000);
driver.close(); //--------no such window exception(it is closing the
//              2nd tab but not going towards back to the first tab)
//driver.switchTo().window(firstTab).close();
   }}