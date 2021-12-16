import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		// April 23
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();

		driver.findElement(By.cssSelector("[class='datepicker-switch']")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-months'] [class='datepicker-switch']")).getText()
				.contains("2022")) {
			driver.findElement(By.cssSelector("[class='datepicker-months'] th[class='next']")).click();
		}

		List<WebElement> months = driver.findElements(By.className("month"));
		// Grab common attribute//Put into list and iterate
		int monthcount = driver.findElements(By.className("month")).size();

		for (int m = 0; m < monthcount; m++) {
			String monthtext = driver.findElements(By.className("month")).get(m).getText();
			if (monthtext.equalsIgnoreCase("May")) {
				driver.findElements(By.className("month")).get(m).click();
				break;
			}
		}

			List<WebElement> dates = driver.findElements(By.className("day"));
			// Grab common attribute//Put into list and iterate
			int count = driver.findElements(By.className("day")).size();

			for (int i = 0; i < count; i++) {
				String text = driver.findElements(By.className("day")).get(i).getText();
				if (text.equalsIgnoreCase("20")) {
					driver.findElements(By.className("day")).get(i).click();
					break;
				}

			}
		}
	}

