package datePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/date-picker");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("dateAndTimePickerInput"))).click().build().perform();
		driver.findElement(By.className("react-datepicker__year-read-view--down-arrow")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='react-datepicker__year-dropdown']//div[02]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("react-datepicker__month-read-view--down-arrow")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='react-datepicker__month-dropdown']//div[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='react-datepicker__month']//*[contains(text(),'17')]")).click();
		driver.findElement(By.xpath("//*[@class='react-datepicker__time-list-item ' and contains(text(),'19:00')]")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

	public static void datePicker() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/date-picker");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("datePickerMonthYearInput"))).click().build().perform();
		Select years = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		years.selectByValue("1997");

		Select months = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		months.selectByValue("0");
		driver.findElement(By.xpath("//*[@class='react-datepicker__month']//div[contains(text(),'5')]")).click();
		driver.close();
	}
}
