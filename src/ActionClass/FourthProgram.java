package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Configuration.ConfigurationPath;

public class FourthProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		
		Select S = new Select(year);
		
		S.selectByVisibleText("1998");
		
		
		
	}
}
//""