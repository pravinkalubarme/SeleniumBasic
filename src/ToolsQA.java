import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.demoqa.com/radio-button");
//		WebElement radioButton1 = driver.findElement(By.id("yesRadio"));
//		WebElement radioButton2 = driver.findElement(By.id("noRadio"));
//		System.out.println("Is Radio button1 is enabled: " + radioButton1.isEnabled());
//		System.out.println("Is Radio button2 is enabled: " + radioButton2.isEnabled());
		
		driver.get("https://www.demoqa.com/checkbox");
		WebElement command = driver.findElement(By.xpath("//*[contains(text(),'Commands')]/preceding-sibling::input"));
		System.out.println(command.isEnabled());
		command.click();
		System.out.println("Is Commands checkbox is selected: "+command.isSelected());
	}
}
