package Robot_Class;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;

public class practice1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//opent the app
		driver.get("https://www.amazon.com/");
		//create object of Robot class
	  Robot r=new Robot();
	  //keypress
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  
	  Thread.sleep(4000);
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  
	  Thread.sleep(4000);
	  
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  
	  Thread.sleep(4000);
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
		

}
