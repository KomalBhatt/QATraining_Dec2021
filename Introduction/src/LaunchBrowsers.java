import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		System.out.println(driver.getTitle());

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://www.google.ca/");
		System.out.println(driver.getTitle());

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\eclipse-workspace\\IEDriver.exe");
		WebDriver driver2 = new InternetExplorerDriver();

		driver2.get("https://www.google.ca/");
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.close();
	}

}
