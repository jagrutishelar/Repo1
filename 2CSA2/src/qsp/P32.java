package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
public class P32 {//to perform keyboard actions automatically
public static void main(String[] args) throws IOException,
                            InterruptedException, AWTException {
		
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_SHIFT);
		r1.keyPress(KeyEvent.VK_Q);
		r1.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_P);
		
	}

}
