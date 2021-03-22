package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//senior automation TE
	@FindBy(id="username")
	private WebElement untb;//declaration
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	LoginPage(WebDriver driver){//constructor initialization
		
		PageFactory.initElements(driver, this);

	}
	
	public void setUsername(String usn) {//utilization
		
		untb.sendKeys(usn);
	}
	
	public void setPassword(String pw) {
		
		pwtb.sendKeys(pw);
	}
	
	public void clickLogin() throws InterruptedException {
		loginButton.click();
		Thread.sleep(2000);
	}

}
