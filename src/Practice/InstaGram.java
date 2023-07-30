package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class InstaGram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		

		
		 driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Rushikesh");
		
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("987789");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

	
}
//""