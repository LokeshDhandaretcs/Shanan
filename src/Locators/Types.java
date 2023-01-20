package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.actitime.com/login.do");
	
	//enter username
	driver.findElement(By.id("username")).sendKeys("admin");

	//enter pasword
	driver.findElement(By.id("pwd")).sendKeys("manager");
	
	//click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//expected title
	String expT="actiTIME -  Enter Time-Track";
	String actT = driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
	
}
}
