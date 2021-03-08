package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helperClass {

	public WebDriver driver1(String driverPath)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+driverPath );
		WebDriver driver= new ChromeDriver();
		return driver;	
	}

}
