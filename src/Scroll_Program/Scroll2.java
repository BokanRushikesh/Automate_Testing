package Scroll_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Scroll2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		 WebElement loc = driver.findElement(By.xpath("//a[text()='Germany']"));
		 
		
		
		
		 Thread.sleep(2000);
		 
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",loc);
		
		
		 
	}
}
//""