package uploadFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload/");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//input[@type='file']"))
				.sendKeys(System.getProperty("user.dir") + "\\Resource\\env.properties");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("submitbutton")).click();

	}

}
