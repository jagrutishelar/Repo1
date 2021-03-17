package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P2 {
	@Test
	public void watermelon() {
		
		Reporter.log("from watermelon",true);
	}
	
	@Test
	public void yatch() {
		
		Reporter.log("from yatch",true);
	}
	
	@Test
	public void xray() {
		
		Reporter.log("from xray",true);
	}

}
