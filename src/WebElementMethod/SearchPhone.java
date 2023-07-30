package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPhone {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	
	
	 driver.manage().window().maximize();
	
	 driver.get("https://www.google.co.in/");
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14");
	
		
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	
		
	
	}

}
