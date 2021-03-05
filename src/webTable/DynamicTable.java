package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		currentPrice(driver, "Ltd");
		currentPrice(driver, "Bank");
		driver.close();
	}

	public static String currentPrice(WebDriver driver, String Company) {
		String price = null;
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		for (WebElement eachRow : rows) {
			String companyName = eachRow.findElement(By.xpath("td[1]")).getText();
			if (companyName.contains(Company)) {
				price = eachRow.findElement(By.xpath("td[4]")).getText();
				System.out.println(companyName+": "+price);
				break;
			}
		}
		return price;
	}

}
