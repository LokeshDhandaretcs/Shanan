package Selenium_Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver Driver=new ChromeDriver();
		 Driver.get("https://www.flipkart.com/");
		 
		 Driver.manage().window().minimize();
		 
	}
		 
	}