package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	String value = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr//td//a[contains(text(),'UCO Bank')]/parent::td/following-sibling::td[3]")).getText();
	System.out.println(value);
}
}
