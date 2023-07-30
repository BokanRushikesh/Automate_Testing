package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import Configuration.ConfigurationPath;

public class FB {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		 driver.get("https://en-gb.facebook.com/reg/");
		 
		 driver.manage().window().maximize();
		 
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s = new Select(day);
		
	    
		
	
	}
}
//""