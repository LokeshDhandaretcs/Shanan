package Web_driver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitel {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//test data
		String expT="Amazon.com. Spent less.Smile more.";
		String actT=driver.getTitle();
		if(expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
			
		}
}

}
