package Web_driver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		//Open the Driver
		
		Driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		
		Driver.navigate().to("https://www.facebook.com/");
		//backward
		Driver.navigate().back();
		
		//farward
		Driver.navigate().forward();
		
		//refresh
		Driver.navigate().refresh();
		
		
		//Maximize
		Driver.manage().window().maximize();
		
	}

}
