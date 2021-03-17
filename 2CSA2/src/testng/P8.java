package testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P8 {
	
	@Test
	public void mnop() {
		System.out.println("from test method mnop");
	}
	
	@BeforeMethod
	public void abcd() {
		System.out.println("from before method");
	}
	
	@AfterMethod
	public void ijk() {
		System.out.println("from After method");
	}
	
	@Test
	public void xyz() {
		System.out.println("from test method xyz");
	}

}
