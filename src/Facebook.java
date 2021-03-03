import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		String basePath = System.getProperty("user.dir");
		System.out.println(basePath);
		String driverPath = basePath + "/Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/");
		System.out.println("URL Opened");
		driver.get("https://www.demoqa.com/checkbox");
		System.out.println("Searching Checkbox element");
		driver.findElement(By.xpath("//span[contains(text(), 'Check Box') and @class='text']")).click();
		System.out.println("Got Checkbox element");
		System.out.println("Searching notes element");
		WebElement notes = driver.findElement(By.xpath("//span[contains(text(), 'Notes')]"));
		}
}