package Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphonebuy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14");
		
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		
		
	}
	
	
	
	
	
	
}
//""