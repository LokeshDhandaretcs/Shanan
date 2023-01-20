package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		
		//use javascript executor interface
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//Scroll Down
		jse.executeScript("window.scrollBy(0,8000);");
		
		//Scroll up
		jse.executeScript("window.scrollBy(0,-6000;");
		
	}

}
