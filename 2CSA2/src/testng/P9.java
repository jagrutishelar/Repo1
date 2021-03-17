package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P9 {	
	@BeforeTest
	public void t1() {
		System.out.println("from before Test t1");
	}
	@Test
	public void m1() {
		System.out.println("from test m1");
	}
	
	@Test
	public void m2() {
		System.out.println("from test m2");
	}
	
	@BeforeMethod
	public void m3() {
		System.out.println("from before method");
	}
	
	@AfterMethod
	public void m4() {
		System.out.println("from after method");
	}

	@BeforeClass
	public void m5() {
	System.out.println("from before class of P9");
	}
	
	@AfterClass
	public void m6() {
	System.out.println("from after class of P9");
	}

}
