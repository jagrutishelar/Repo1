package qsp;

import java.awt.AWTException;
import java.awt.Robot;
public class P31 {//to perform mouse actions automatically
public static void main(String[] args) throws AWTException, InterruptedException {
System.out.println("click on terminatebutton before the program stops");
		Robot r1 = new Robot();
		for(int i=0;i<=50;i++) {
			r1.mouseMove(i, 100);
			Thread.sleep(500);
			System.out.println(i);
		}
		

	}

}
