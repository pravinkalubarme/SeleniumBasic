import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		String basePath = System.getProperty("user.dir");
		System.out.println(basePath);
		String driverPath=basePath+"/Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver = new ChromeDriver();
       	driver.manage().window().maximize();
     	driver.get("https://www.google.com/");
     	Thread.sleep(1000);
     	driver.close();    	
	}
}