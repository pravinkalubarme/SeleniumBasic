package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/elements");
		WebElement webTable = driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]"));
		webTable.click();
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ABC");
	}
}