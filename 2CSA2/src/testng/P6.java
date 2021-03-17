package testng;
import org.testng.annotations.Test;

public class P6 {
	
	@Test(priority=5,invocationCount=3)
	public void pen() {
		System.out.println("from pen");
	}
	
	@Test(priority=10,invocationCount=4)
	public void mouse() {
		System.out.println("from mouse");
	}
	
	@Test(priority=2,invocationCount=6)
	public void duster() {
		System.out.println("from duster");
	}
	
	@Test(priority=1,invocationCount=5)
	public void keyboard() {
		System.out.println("from keyboard");
	}

}
