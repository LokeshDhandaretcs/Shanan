
package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Practice2 {
	public static void main(String[] args) throws Throwable{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//typecast takescreenshot interface
	TakesScreenshot tp=(TakesScreenshot) driver;
	
	//take the screenshot using getscreenshot method
	File src = tp.getScreenshotAs(OutputType.FILE);
	//create object  of file class
	
	File dest=new File("\"C:\\Users\\HP\\OneDrive\\Desktop\\screenshot\"");
	//we need to covert sreenshot from src to destination
	Files.copy(src, dest);
	
	
	
	

}
}