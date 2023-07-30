package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class FBook1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='First name']/following::input[2]")).sendKeys("ghule");
		
		driver.findElement(By.xpath("//div[text()='First name']/following::input[3]")).sendKeys("9998889997");
		
		driver.findElement(By.xpath("//div[text()='First name']/following::input[5]")).sendKeys("password123");
		
		driver.findElement(By.xpath("//div[text()='New password']/following::select[1]")).sendKeys("24");
		
		driver.findElement(By.xpath("//option[text()='2023']/preceding::select[1]")).sendKeys("Jun");
		
		driver.findElement(By.xpath("//label[text()='Male']/preceding::select[1]")).sendKeys("1999");
		
		driver.findElement(By.xpath("//label[text()='Male']/preceding::input[8]")).sendKeys("Rushi");
		
		driver.findElement(By.xpath("//button[text()='Sign Up']/preceding::input[3]")).click();
		
		driver.findElement(By.xpath("//option[text()='Jan']/following::button[1]")).click();
		
	}
}
//""