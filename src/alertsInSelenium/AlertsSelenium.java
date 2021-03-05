package alertsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsSelenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		System.out.println("Searching alert button");
//		WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'Click me') and @id='alertButton']"));
//		System.out.println("Got alert button");
//		alertButton.click();
//		Alert a = driver.switchTo().alert();
//		System.out.println(a.getText());
//		a.accept();
		
//		WebElement confirmButton = driver.findElement(By.xpath("//button[contains(text(),'Click me') and @id='confirmButton']"));
//		confirmButton.click();
//		Alert a1=driver.switchTo().alert();
//		System.out.println(a1.getText());
//		a1.dismiss();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me') and @id='promtButton']")).click();
		Alert a2= driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.sendKeys("Namaste");
		a2.accept();
		//a2.dismiss();
	}

}
