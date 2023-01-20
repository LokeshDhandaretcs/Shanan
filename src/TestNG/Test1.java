package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
@Test
public void TC1 () {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter un
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");	
	Reporter.log("hi good morning",true);
	
	
}
}
