package suggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Youtube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("songs");
		
		//input[@id='search']
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
//		driver.findElement(By.xpath("//h3[@id='video-title']")).click();
		
//		driver.findElement(By.xpath("//div[@class='sc-kDvujY uBOgk']")).click();
		
		
		
	}
}
//""