package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study9 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Notes\\Automation\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // if you want run your program in
		                                     //browser then use webdriver interface
		
		//chromedriver=new chromedriver();  it will run only on chrome
		
	    driver.get("https://www.facebook.com/signup");
	    Thread.sleep(5000);
	  
	    driver.findElement(By.xpath("//a  [@class='_9bq5']")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().back();
	    
	    driver.close();
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rushikesh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bokan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9096231202");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("909134");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select [@name = 'birthday_day']")).sendKeys("24");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select [@title='Month']")).sendKeys("Dec");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
	    driver.close();
	
	
	
	
	
	
	
	}

}
