package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newmulti {
	@Parameters("browsername")
	@Test
	public void Tc1(String browsername) {
		//declared global variable
		WebDriver driver=null;
		
		//apply condition
		if(browsername.equals("Chrome")) {
			
			//for chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Velocity Classes\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
		driver.get("https://www.amazon.in/");
	}

}
