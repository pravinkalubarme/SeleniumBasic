package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleValueDropDown {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			WebElement Country = driver.findElement(By.xpath("//select[@name='country']"));
			//System.out.println(Country.getText());
			
			Select sel = new Select(Country);
			sel.selectByIndex(2);
            Thread.sleep(2000);
			sel.selectByVisibleText("KENYA");
			Thread.sleep(2000);
			sel.selectByValue("INDIA");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
}
