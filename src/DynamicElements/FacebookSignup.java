package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Configuration.ConfigurationPath;

public class FacebookSignup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.WebDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='First name']/following-sibling::input")).sendKeys("Rushi");
		
		
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Bokan");
		
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("8899009988");
		
//		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("11223344");
//		driver.findElement(By.xpath("//div[@id=\"reg_form_box\"]/child::div[11]")).click();
		
//		driver.findElement(By.xpath("//div[@id=\"birthday_wrapper\"]/preceding-sibling::div")).sendKeys("sasdf");
		
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input[3]")).sendKeys("223344");
		
	}
}
//""