package DynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class FBook2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//div[text()='New password']/preceding::input[4]")).sendKeys("Ajay");
		
		driver.findElement(By.xpath("//div[text()='New password']/following::input[5]")).click();
		
		driver.findElement(By.xpath("//option[text()='2023']/preceding::select[1]")).sendKeys("Apr");
		
		driver.findElement(By.xpath("//input[@id=\"u_0_b_WD\"]/parent::div")).sendKeys("poiuy");
		
           
	}
}
//""