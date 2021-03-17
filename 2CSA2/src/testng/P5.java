package testng;
import org.testng.annotations.Test;

public class P5 {
	
	@Test(invocationCount=3)
	public void pen() {
		System.out.println("from pen");
	}
	
	@Test(invocationCount=4)
	public void mouse() {
		System.out.println("from mouse");
	}
	
	@Test(invocationCount=6)
	public void duster() {
		System.out.println("from duster");
	}
	
	@Test(invocationCount=5)
	public void keyboard() {
		System.out.println("from keyboard");
	}

}
