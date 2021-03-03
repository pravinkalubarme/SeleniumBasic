import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) {
		try {
			String basePath = System.getProperty("user.dir");
			System.out.println(basePath);
			String driverPath = basePath + "/Driver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/radio.html");
			WebElement radioButton = driver.findElement(By.xpath("//*//*[@type='radio' and @value='Option 2']"));
			System.out.println("Radio button is displayed: " + radioButton.isDisplayed());
			radioButton.click();
			System.out.println("Radio button is selected: " + radioButton.isSelected());
			Thread.sleep(1500);

			WebElement checkBox1 = driver.findElement(By.xpath("//*[@type='checkbox' and @value='checkbox1']"));
			WebElement checkBox3 = driver.findElement(By.xpath("//*[@type='checkbox' and @value='checkbox3']"));
			System.out.println("Check box 3 is displayed: "+checkBox1.isDisplayed());
			System.out.println("Check box 3 is displayed: "+checkBox3.isSelected());
			checkBox1.click();
			checkBox3.click();
			System.out.println("Check box 1 is selected: "+checkBox1.isSelected());
			System.out.println("Check box 3 is selected: "+checkBox3.isSelected());
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
}
