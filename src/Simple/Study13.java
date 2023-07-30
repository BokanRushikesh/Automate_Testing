package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study13 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver Ankita = new ChromeDriver();
		
		Ankita.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		Thread.sleep(2000);
		
		Ankita.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("09890099889");
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
		

		


}
