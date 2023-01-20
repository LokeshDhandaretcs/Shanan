package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void TC1() {
    Reporter.log("running tc1",true);
		
	}
	public void TC2() {
	    Reporter.log("running tc1",true);
}
	public void TC3() {
	    Reporter.log("running tc1",true);
	}
}