package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P10 {
	@AfterTest
	public void t2() {
		System.out.println("from after Test t2");
	}
	
	@Test
	public void p1() {
		System.out.println("from test P1");
	}
	
	@Test
	public void p2() {
		System.out.println("from test P2");
	}
	
	@BeforeMethod
	public void p3() {
		System.out.println("from before method");
	}
	
	@AfterMethod
	public void p4() {
		System.out.println("from after method");
	}

	@BeforeClass
	public void p5() {
	System.out.println("from before class of P10");
	}
	
	@AfterClass
	public void p6() {
	System.out.println("from after class of P10");
	}

}
