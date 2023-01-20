package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_attribute {
	public static void main(String[] args) {
		
		

		//set the properties
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://demo.actitime.com/login.do");
				//enter un
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
				//enter pwd
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
				//clcik on login btn
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				//verify user should naviagte to home page
				String expectedT="actiTIME - Login";
				String actualT=driver.getTitle();
				System.out.println(actualT);
				if(expectedT.equals(actualT)) {
					System.out.println("TC is pass,User is navigated to Home page");
				}
				else {
					System.out.println("TC is fail");
				}
				

	}

}
