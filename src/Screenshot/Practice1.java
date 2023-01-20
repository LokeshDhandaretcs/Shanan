package Screenshot;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Practice1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//take the xpath of an element
	WebElement abc = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	File src = abc.getScreenshotAs(OutputType.FILE);
	//create object of file class
	File dest=new File("C:\\Users\\HP\\OneDrive\\Desktop\\screenshot\\perticular.jpg");
     //copy method
     Files.copy(src, dest);
     
	}
		
}



