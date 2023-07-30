package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Configuration.ConfigurationPath;

public class Rushi {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.geckodriver", ConfigurationPath.Firefox);
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ravina");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sharma");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();;
}
}

//""