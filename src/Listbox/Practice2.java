package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//opent the app
				driver.get("https://www.facebook.com/");
				//click on create new acccount btn
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//a role[@id='u_0_0_Kf']")).click();
				

	}

}
