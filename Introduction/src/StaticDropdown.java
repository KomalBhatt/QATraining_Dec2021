import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		WebElement staticDropdown = driver.findElement(By.id("ct100_mainContent_DropDownListCurrency"));
		
		Select  dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
