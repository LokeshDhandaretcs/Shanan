package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_annotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser",true);
		
	}
	@BeforeMethod
	public void logintoApp() {	
	Reporter.log("Login to App", true);
	}
	
    @Test
    public void verifyText() {
    	Reporter.log("Running Actual test case",true); 	
    }
   @AfterMethod
   public void CloseBrowser() {
	   Reporter.log("Close the Browser",true);
	   
   }
    
}



