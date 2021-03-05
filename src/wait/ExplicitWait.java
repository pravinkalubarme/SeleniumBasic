package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/elements");
		System.out.println("Dynamic Properties searching");
		Thread.sleep(4000);
		//scroll down manually
		driver.findElement(By.xpath("//span[contains(text(),'Dynamic Properties')]/parent::li")).click();
		System.out.println("Dynamic Properties found");
		System.out.println("Enable after searching");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.pollingEvery(2, TimeUnit.SECONDS);
		System.out.println("Before");
		WebElement enableAfter = driver.findElement(By.id("enableAfter"));
		wait.until(ExpectedConditions.elementToBeClickable(enableAfter));
		//wait.until(ExpectedConditions.visibilityOf(enableAfter));
		//wait.until(ExpectedConditions.elementToBeSelected(enableAfter));
		System.out.println("After");
	    driver.findElement(By.id("enableAfter")).click();
	}
}
