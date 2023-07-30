package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//body[@class='fk-modal-visible']")).click();
	
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
	
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	}
	
	
	
	

}
