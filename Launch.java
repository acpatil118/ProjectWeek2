package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;


public class Launch 
{

	public static  void main(String[] args) 
	
	{
		WebDriver driver = (WebDriver) new ChromeDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com/");
}
}