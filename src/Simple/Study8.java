package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study8 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rushikesh");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sjdhgiurue");
	
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rushikesh");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bokan");
	
	driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("9096231202");
	
	driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("9096231202");
	
	driver.findElement(By.xpath("//select [@name = 'birthday_day']")).sendKeys("24");
	
	driver.findElement(By.xpath("//select [@title='Month']")).sendKeys("10");
	
	
	
	
	
	
	
	
	
	}

}
