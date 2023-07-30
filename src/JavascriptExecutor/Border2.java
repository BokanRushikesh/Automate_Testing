package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Configuration.ConfigurationPath;

public class Border2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		 WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		 
		 WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		 
		 JavascriptExecutor js =  (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].style.border='4px solid green'", lname);
		 
		 js.executeScript("arguments[0].style.border='4px solid orange'", name);
	}
}
//"" ''