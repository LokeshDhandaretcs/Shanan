package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("Hii Looking good", true);
		Assert.fail();
	}
	@Test
	public void TC2() {
		Reporter.log("Ohh Thank you", true);
		Assert.fail();
	}
	@Test
	public void TC3() {
		Reporter.log("Tast case pass", true);
	}
		@Test
		public void TC4() {
			Reporter.log("test case pass", true);
		
		
		
	
	
	
	
	
	}

}
