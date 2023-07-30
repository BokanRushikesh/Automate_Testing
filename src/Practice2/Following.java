package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class Following {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.findElement(By.xpath("//div[text()='First name']/following::input[3]")).sendKeys("9998887770");
		
		driver.findElement(By.xpath("//div[text()='First name']/following::input[5]")).sendKeys("asdfgfds");
		
		driver.findElement(By.xpath("//div[text()='New password']/preceding::input[4]")).sendKeys("sachin");
		
		driver.findElement(By.xpath("//button[text()='Sign Up']/preceding::select[4]")).sendKeys("24");
		
		driver.findElement(By.xpath("//div[text()='Surname']/following::input[8]")).click();
	}
}
//""