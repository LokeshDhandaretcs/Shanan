package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	public static void main(String[] args) throws Throwable{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		
		// create new account between thread sleep
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 
		 Thread.sleep(4000);
		 //select day listbox 
		  WebElement day=driver.findElement(By.xpath("////select[@id='day']"));
		
		  //create a object of selectbox
		  Select s=new Select(day);
		  Thread.sleep(4000);
		 
		 //use select class method
		  //s.selectByValue("15");
		  
		  //select by visible text
		  s.selectByVisibleText("15");
		  
		  
}
}