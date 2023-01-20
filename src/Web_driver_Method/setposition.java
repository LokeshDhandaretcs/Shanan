package Web_driver_Method;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.monsterindia.com/");
		
		
		//Crete object of Point class 
		
		Point p=new Point(300,400);
		
		//use setsize method
		
	driver.manage().window().setPosition(p);
		
				
	}

}
