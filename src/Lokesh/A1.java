package Lokesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://instagram.com/");
	}

}
