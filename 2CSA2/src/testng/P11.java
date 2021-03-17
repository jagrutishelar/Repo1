package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P11 {
	
	@Test
	public void testApp() {
		String s1 = "Google";
		String s2 =	"BOOOOGLE";
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2)) {//compares values
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
			Assert.fail();
		}
		
		System.out.println("THE END");
	}

}
