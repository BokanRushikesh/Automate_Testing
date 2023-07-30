package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Iframe2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",ConfigurationPath.WebDriverPath );
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		driver.switchTo().frame("float: left;height: 300px;width:600px");
		
		driver.switchTo().frame("float: left;height: 250px;width: 400px");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asdf");
		
		
		
		
		
		
		
		
		
	}
		


}
