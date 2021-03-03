package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropDown {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://output.jsbin.com/osebed/2");
			WebElement fruits = driver.findElement(By.id("fruits"));
			Select s = new Select(fruits);
			System.out.println(s.isMultiple());
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByValue("grape");
			Thread.sleep(2000);
			s.selectByValue("orange");
			Thread.sleep(2000);
//		 s.deselectByIndex(0);
//		 Thread.sleep(2000);
//		 s.deselectByVisibleText("Orange");
//		 Thread.sleep(2000);
//		 s.deselectByValue("grape");
			List<WebElement> options = s.getOptions();
			options.size();
			System.out.println("==============================================");
			for (int i = 0; i < options.size(); i++) {
				System.out.println(options.get(i).getText());
			}
			System.out.println("==============================================");
			for (WebElement each : options) {
				System.out.println(each.getText());
			}
            
			System.out.println("==============================================");
			List<WebElement> selected = s.getAllSelectedOptions();
			System.out.println("Selected Options: ");
			for (WebElement each : selected) {
				System.out.print(" " + each.getText());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
