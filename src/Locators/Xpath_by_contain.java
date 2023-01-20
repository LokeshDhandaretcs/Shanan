package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contain {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter un
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		//enter password
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		//click on login btn
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	}
		
	}

